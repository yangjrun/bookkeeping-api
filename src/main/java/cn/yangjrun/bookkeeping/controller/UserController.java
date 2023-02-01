package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.commons.Result;
import cn.yangjrun.bookkeeping.entity.User;
import cn.yangjrun.bookkeeping.service.IUserService;
import cn.yangjrun.bookkeeping.service.consts.ServicePathConst;
import cn.yangjrun.bookkeeping.vo.UserVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ServicePathConst.PREFIX_USER_PATH)
@Api(value = "用户操作Controller",tags={"用户操作接口"})
public class UserController {

    private IUserService userService;

    @Autowired
    public void setUserService(IUserService iUserService){
        this.userService = iUserService;
    }

    @ApiOperation(value = "添加用户")
    @PostMapping("/insert")
    public Result insert(@RequestBody @ApiParam(name="用户对象",value="传入json格式",required=true)UserVO userVO){
        User user = new User();
        BeanUtils.copyProperties(userVO,user);
        return userService.save(user) ? Result.ok() : Result.error("注册失败");
    }


}
