package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jirun.yang
 * @date 2020-02-21 12:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentType {
    private String id;
    private String value;
}
