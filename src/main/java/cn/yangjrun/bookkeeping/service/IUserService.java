package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.User;
import cn.yangjrun.bookkeeping.vo.UserVO;
import com.baomidou.mybatisplus.extension.service.IService;

public interface IUserService extends IService<User> {


    /**
     * 根据登录名称获取用户信息
     * @param userName
     * @return
     */
    User getOneByUserName(String userName);

}
