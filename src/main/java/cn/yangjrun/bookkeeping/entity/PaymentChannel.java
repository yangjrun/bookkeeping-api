package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;

/**
 * @author jirun.yang
 * @date 2020-02-21 12:06
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class PaymentChannel {
    private String id;
    private String value;

}
