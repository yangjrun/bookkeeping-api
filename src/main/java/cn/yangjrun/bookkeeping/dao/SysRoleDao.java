package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface SysRoleDao {

    /**
     * 根据id集合获取对应的角色
     * @param ids
     * @return
     */
    List<SysRole> getSysRoleByIds(@Param("ids") Collection ids);

}
