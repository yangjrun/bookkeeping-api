package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserRole {

    private Long id;

    private String userId;

    private Long roleId;

}
