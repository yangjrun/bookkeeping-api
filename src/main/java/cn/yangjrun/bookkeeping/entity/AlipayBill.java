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
    public String TransactionNumber;

    /**
     * 商家订单号
     */
    public String MerchantOrderNumber ;

    /**
     * 交易创建时间
     */
    public String TransactionCreationTime ;
    /**
     * 付款时间
     */
    public String PaymentTime ;

    /**
     * 最近修改时间 <br/>
     * 淘宝/天猫的账单修改时间是发货时间/收货时间
     */
    public String LastModifiedTime ;

    /**
     * 交易来源地
     */
    public String OriginOfTransaction ;

    /**
     * 类型
     */
    public String Type ;

    /**
     * 交易对方
     */
    public String Counterpart ;

    /**
     * 商品名称
     */
    public String ProductName ;

    /**
     * 金额
     */
    public String Amount ;

    /**
     * 支付类型
     */
    public String PaymentType ;

    /**
     * 交易状态
     */
    public String TradingStatus ;

    /**
     * 服务费
     */
    public String ServiceCharge ;

    /**
     * 成功退款金额
     */
    public String SuccessfulRefundAmount ;

    /**
     * 备注
     */
    public String Remark ;

    /**
     * 资金状态
     */
    public String FundingStatus ;
}
