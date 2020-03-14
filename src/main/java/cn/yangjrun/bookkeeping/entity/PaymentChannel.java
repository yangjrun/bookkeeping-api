package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 付款渠道
 * @author jirun.yang
 * @date 2020-02-21 12:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PaymentChannel {
    private String id;
    private String value;

}
