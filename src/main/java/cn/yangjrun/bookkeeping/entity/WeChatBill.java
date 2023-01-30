package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeChatBill {

    private String id;

    /**
     * 交易创建时间
     */
    private String transactionCreationTime;


    /**
     * 交易类型
     */
    private String type;

    /**
     * 交易对方
     */
    private String counterpart ;

    /**
     * 商品名称
     */
    private String productName ;

    /**
     * 金额
     */
    private String amount ;

    /**
     * 支付类型
     */
    private String paymentType ;

    /**
     * 支付方式
     */
    private String paymentMethod;

    /**
     * 资金状态
     */
    private String fundingStatus ;

    /**
     * 交易号
     */
    private String transactionNumber;

    /**
     * 商家订单号
     */
    private String merchantOrderNumber ;


    /**
     * 备注
     */
    private String remark ;
}
