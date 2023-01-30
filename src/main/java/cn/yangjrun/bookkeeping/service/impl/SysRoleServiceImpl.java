package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.SysRoleDao;
import cn.yangjrun.bookkeeping.entity.SysRole;
import cn.yangjrun.bookkeeping.service.ISysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

@Service
public class SysRoleServiceImpl implements ISysRoleService {

    private SysRoleDao sysRoleDao;

    @Autowired
    public void setSysRoleDao(SysRoleDao sysRoleDao){
        this.sysRoleDao = sysRoleDao;
    }

    @Override
    public List<SysRole> getSysRoleByIds(Collection ids) {
        return sysRoleDao.getSysRoleByIds(ids);
    }
}
