package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * @author jirun.yang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookKeeping {

    public enum BookkeepingPaymentEnum{

    }

    public enum BookkeepingPaymentChannelEnum{

    }

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
     * 消费类型  收入，支出
     */
    private String paymentTypeId;
    /**
     * 消费渠道 微信，支付宝，银行卡
     */
    private String paymentChannelId;

    /**
     * 消费用途
     */
    private String paymentUseId;

}
