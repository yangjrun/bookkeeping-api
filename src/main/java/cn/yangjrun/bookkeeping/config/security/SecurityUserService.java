package cn.yangjrun.bookkeeping.config.security;

import cn.yangjrun.bookkeeping.entity.SysRole;
import cn.yangjrun.bookkeeping.entity.User;
import cn.yangjrun.bookkeeping.entity.UserRole;
import cn.yangjrun.bookkeeping.service.ISysMenuService;
import cn.yangjrun.bookkeeping.service.ISysRoleService;
import cn.yangjrun.bookkeeping.service.IUserRoleService;
import cn.yangjrun.bookkeeping.service.IUserService;
import cn.yangjrun.bookkeeping.service.impl.SysMenuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.util.ObjectUtils;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class SecurityUserService implements UserDetailsService {

    /**
     * 自己系统的用户体系
     */
    private IUserService userService;
    private IUserRoleService userRoleService;
    private ISysMenuService sysMenuService;
    private ISysRoleService sysRoleService;
    /**
     * spring security 加密方式
     */
    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setUserRoleService(IUserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }
    @Autowired
    public void setSysMenuService(ISysMenuService sysMenuService) {
        this.sysMenuService = sysMenuService;
    }
    @Autowired
    public void setSysRoleService(ISysRoleService sysRoleService) {
        this.sysRoleService = sysRoleService;
    }

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    @Autowired
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userService.getOneByUserName(username);
        if(user==null){
            throw new UsernameNotFoundException("用户名或密码错误！！");
        }
        //获取用户权限，并把其添加到GrantedAuthority中
        Set<GrantedAuthority> grantedAuthorities=new HashSet<>();
        List<UserRole> userRoles = userRoleService.getUserRoleByUserId(user.getId());
        if(!ObjectUtils.isEmpty(userRoles)){
            // 用户的所有角色ID
            Set<Long> roleIds = userRoles.stream().map(UserRole::getRoleId).collect(Collectors.toSet());
            // 角色详情列表
            List<SysRole> sysRoles = sysRoleService.getSysRoleByIds(roleIds);
            // 所有角色下的资源权限
            List<String> permissionsByRoleIds = sysMenuService.getPermissionsByRoleIds(roleIds);

            // 添加 角色权限
            sysRoles.forEach(r->{
                // spring security 角色权限默认前缀有：ROLE_
                GrantedAuthority grantedAuthority=new SimpleGrantedAuthority("ROLE_"+r.getRoleName().trim());
                grantedAuthorities.add(grantedAuthority);
            });

            //添加资源权限
            permissionsByRoleIds.forEach(permission->{
//                GrantedAuthority grantedAuthority=new SimpleGrantedAuthority("ROLE_"+permission.trim());
                // 这里不加前缀，可以使用 hasAuthority() 方法
                GrantedAuthority grantedAuthority=new SimpleGrantedAuthority(permission.trim());
                grantedAuthorities.add(grantedAuthority);
            });
        }

        SecurityUser securityUser = new SecurityUser();
        securityUser.setUsername(user.getUserName())
                .setNickName(user.getNickName())
                .setPassword(passwordEncoder.encode(user.getPassword()))
                .setAuthorities(grantedAuthorities);
        return securityUser;
    }
}
