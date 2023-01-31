package cn.yangjrun.bookkeeping.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel(value="user对象",description="用户对象user")
public class UserVO {

    @NotNull(message = "用户昵称必须填写")
    @ApiModelProperty(value = "用户昵称", name = "nickName", required=true)
    private String nickName;

    @NotNull(message = "登录名称必须填写")
    @ApiModelProperty(value = "登录名称", name = "userName", required=true)
    private String userName;

    @NotNull(message = "登录密码必须填写")
    @ApiModelProperty(value = "登录密码", name = "password", required=true)
    private String password;

}
