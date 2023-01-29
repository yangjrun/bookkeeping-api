package cn.yangjrun.bookkeeping.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;


@Data
public class AlipayBillDTO {

    /**
     * 交易号
     */
    @ExcelProperty(index = 0)
    public String TransactionNumber;

    /**
    * 商家订单号
    */
    @ExcelProperty(index = 1)
    public String MerchantOrderNumber ;

    /**
    * 交易创建时间
    */
    @ExcelProperty(index = 2)
    public String TransactionCreationTime ;
    /**
    * 付款时间
    */
    @ExcelProperty(index = 3)
    public String PaymentTime ;

    /**
    * 最近修改时间 <br/>
    * 淘宝/天猫的账单修改时间是发货时间/收货时间
    */
    @ExcelProperty(index = 4)
    public String LastModifiedTime ;

    /**
    * 交易来源地
    */
    @ExcelProperty(index = 5)
    public String OriginOfTransaction ;

    /**
    * 类型
    */
    @ExcelProperty(index = 6)
    public String Type ;

    /**
    * 交易对方
    */
    @ExcelProperty(index = 7)
    public String Counterpart ;

    /**
    * 商品名称
    */
    @ExcelProperty(index = 8)
    public String ProductName ;

    /**
    * 金额
    */
    @ExcelProperty(index = 9)
    public String Amount ;

    /**
    * 支付类型
    */
    @ExcelProperty(index = 10)
    public String PaymentType ;

    /**
    * 交易状态
    */
    @ExcelProperty(index = 11)
    public String TradingStatus ;

    /**
    * 服务费
    */
    @ExcelProperty(index = 12)
    public String ServiceCharge ;

    /**
    * 成功退款金额
    */
    @ExcelProperty(index = 13)
    public String SuccessfulRefundAmount ;

    /**
    * 备注
    */
    @ExcelProperty(index = 14)
    public String Remark ;

    /**
    * 资金状态
    */
    @ExcelProperty(index = 15)
    public String FundingStatus ;
}
