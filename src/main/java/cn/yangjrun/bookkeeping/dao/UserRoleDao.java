package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.UserRole;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserRoleDao {

    /**
     * 根据用户id获取对应角色列表
     * @param userId
     * @return
     */
    List<UserRole> getUserRoleByUserId(String userId);
}
