package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.UserDao;
import cn.yangjrun.bookkeeping.entity.User;
import cn.yangjrun.bookkeeping.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public User getOneByUserName(String userName) {
        return userDao.getOneByUserName(userName);
    }
}
