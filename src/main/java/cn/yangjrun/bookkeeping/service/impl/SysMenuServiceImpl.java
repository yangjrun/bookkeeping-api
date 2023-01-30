package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.SysMenuDao;
import cn.yangjrun.bookkeeping.service.ISysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SysMenuServiceImpl implements ISysMenuService {

    private SysMenuDao sysMenuDao;

    @Autowired
    private void setSysMenuDao(SysMenuDao sysMenuDao){
        this.sysMenuDao = sysMenuDao;
    }

    @Override
    public List<String> getPermissionsByRoleIds(Collection roleIds) {
        return sysMenuDao.getPermissionsByRoleIds(roleIds);
    }
}
