package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.SysRole;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

public interface ISysRoleService {

    /**
     * 根据id集合获取对应的角色
     * @param ids
     * @return
     */
    List<SysRole> getSysRoleByIds(Collection ids);


}
