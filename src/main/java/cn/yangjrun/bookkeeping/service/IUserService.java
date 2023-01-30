package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.User;

public interface IUserService {

    /**
     * 根据登录名称获取用户信息
     * @param userName
     * @return
     */
    User getOneByUserName(String userName);

}
