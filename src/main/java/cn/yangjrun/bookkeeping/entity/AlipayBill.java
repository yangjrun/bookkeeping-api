package cn.yangjrun.bookkeeping.entity;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlipayBill {

    private String id;

    /**
     * 交易号
     */
    private String transactionNumber;

    /**
     * 商家订单号
     */
    private String merchantOrderNumber ;

    /**
     * 交易创建时间
     */
    private String transactionCreationTime ;

    /**
     * 付款时间
     */
    private String paymentTime ;

    /**
     * 最近修改时间 <br/>
     * 淘宝/天猫的账单修改时间是发货时间/收货时间
     */
    private String lastModifiedTime ;

    /**
     * 交易来源地
     */
    private String originOfTransaction ;

    /**
     * 类型
     */
    private String type ;

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
     * 交易状态
     */
    private String tradingStatus ;

    /**
     * 服务费
     */
    private String serviceCharge ;

    /**
     * 成功退款金额
     */
    private String successfulRefundAmount ;

    /**
     * 备注
     */
    private String remark ;

    /**
     * 资金状态
     */
    private String fundingStatus ;
}
