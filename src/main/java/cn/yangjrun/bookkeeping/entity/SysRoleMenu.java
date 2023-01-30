package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysRoleMenu {

    private Long id;

    private Long roleId;

    private Long menuId;

    private Date createTime;

}
