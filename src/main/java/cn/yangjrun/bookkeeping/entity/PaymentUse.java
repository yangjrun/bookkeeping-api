package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jirun.yang
 * @date 2020-03-13 09:20
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentUse {
    private String id;
    private String value;
}
