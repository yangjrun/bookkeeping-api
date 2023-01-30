package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.UserRole;

import java.util.List;

public interface IUserRoleService {

    /**
     * 根据用户id获取对应角色列表
     * @param userId
     * @return
     */
    List<UserRole> getUserRoleByUserId(String userId);

}
