package cn.yangjrun.bookkeeping.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface SysMenuDao {

    /**
     * 根据角色id获取对应的菜单权限列表
     * @param roleIds
     * @return
     */
    List<String> getPermissionsByRoleIds(@Param("roleIds") Collection roleIds);

}
