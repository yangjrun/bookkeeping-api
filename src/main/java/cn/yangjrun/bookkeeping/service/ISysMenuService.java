package cn.yangjrun.bookkeeping.service;




import java.util.Collection;
import java.util.List;

public interface ISysMenuService {

    /**
     * 根据角色id获取对应的菜单权限列表
     * @param roleIds
     * @return
     */
    List<String> getPermissionsByRoleIds(Collection roleIds);

}
