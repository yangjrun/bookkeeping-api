package cn.yangjrun.bookkeeping.entity;


import lombok.*;

import javax.validation.constraints.NotBlank;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class User extends AbstractEntity{

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

}
