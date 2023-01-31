package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.User;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao extends BaseMapper<User> {


    /**
     * 根据登录名称获取用户信息
     * @param userName 用户名称
     * @return
     */
    User getOneByUserName(@Param("userName") String userName);



}
