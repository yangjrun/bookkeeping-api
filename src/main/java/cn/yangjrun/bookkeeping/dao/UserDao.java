package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserDao {

    void insert(User user);


    /**
     * 根据登录名称获取用户信息
     * @param userName
     * @return
     */
    User getOneByUserName(@Param("userName") String userName);

    

}
