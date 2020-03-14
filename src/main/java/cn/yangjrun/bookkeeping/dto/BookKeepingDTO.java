package cn.yangjrun.bookkeeping.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author jirun.yang
 * @date 2020-03-12 09:55
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookKeepingDTO {

    private String id;

    /**
     * 消费时间
     */
    private LocalDateTime time;
    /**
     * 消费金额
     */
    private BigDecimal value;

    /**
     * 资金渠道
     */
    private String paymentChannelValue;

    /**
     * 资金类型
     */
    private String paymentTypeValue;

    /**
     * 资金用途
     */
    private String paymentUseValue;

}
