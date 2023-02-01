package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.UserDao;
import cn.yangjrun.bookkeeping.entity.User;
import cn.yangjrun.bookkeeping.service.IUserService;
import cn.yangjrun.bookkeeping.vo.UserVO;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserDao,User> implements IUserService {

    private final static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private UserDao userDao;

    @Autowired
    public void setUserDao(UserDao userDao){
        this.userDao = userDao;
    }

    @Override
    public boolean save(User user) {
        LOGGER.info("user insert parameters： {}", JSON.toJSONString(user));
        if(userDao.selectOne(new QueryWrapper<User>().lambda().eq(User::getUserName, user.getUserName())) != null){
            return  false;
        }
        userDao.insert(user);
        return true;
    }

    @Override
    public User getOneByUserName(String userName) {
        return userDao.getOneByUserName(userName);
    }
}
