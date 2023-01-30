package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.UserRoleDao;
import cn.yangjrun.bookkeeping.entity.UserRole;
import cn.yangjrun.bookkeeping.service.IUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements IUserRoleService {

    private UserRoleDao userRoleDao;

    @Autowired
    private void setUserRoleDao(UserRoleDao userRoleDao){
        this.userRoleDao = userRoleDao;
    }

    @Override
    public List<UserRole> getUserRoleByUserId(String userId) {
        return userRoleDao.getUserRoleByUserId(userId);
    }
}
