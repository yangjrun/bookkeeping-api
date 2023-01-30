package cn.yangjrun.bookkeeping.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String id;

    /**
     * 用户昵称
     */
    private String nickName;

    /**
     * 用户登录账号
     */
    private String userName;

    /**
     * 用户登录密码
     */
    private String password;

    /**
     * 用户创建时间
     */
    private Date createTime;
}
