package cn.yangjrun.bookkeeping.handler.security;

import cn.yangjrun.bookkeeping.config.security.SecurityUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

/**
 * 自定义认证逻辑
 */
@Component
public class SelfAuthenticationProvider implements AuthenticationProvider {

    private SecurityUserService securityUserService;

    @Autowired
    public void setSecurityUserService(SecurityUserService securityUserService) {
        this.securityUserService = securityUserService;
    }


    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Autowired
    private void setbCryptPasswordEncoder(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        //获取用户名
        String account= authentication.getName();
        //获取密码
        String password= (String) authentication.getCredentials();
        UserDetails userDetails= securityUserService.loadUserByUsername(account);
        boolean checkPassword= bCryptPasswordEncoder.matches(password,userDetails.getPassword());
        if(!checkPassword){
            throw new BadCredentialsException("密码不正确，请重新登录!");
        }
        return new UsernamePasswordAuthenticationToken(account,password,userDetails.getAuthorities());
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
