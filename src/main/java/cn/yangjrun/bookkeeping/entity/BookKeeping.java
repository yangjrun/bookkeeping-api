package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Table;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author jirun.yang
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class BookKeeping {

    public enum BookkeepingPaymentEnum{

    }

    public enum BookkeepingPaymentChannelEnum{

    }

    private String id;
    private LocalDate time;
    private BigDecimal value;
    private int paymentTypeId;
    private int paymentChannelId;

}
