package cn.yangjrun.bookkeeping.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRole {

    private long id;

    /**
     * 角色名称
     */
    private String roleName;

    /**
     * 角色描述
     */
    private String roleDesc;

}
