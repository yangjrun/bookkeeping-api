package cn.yangjrun.bookkeeping.dto;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

@Data
public class WeChatBillDTO {

    /**
     * 交易创建时间
     */
    @ExcelProperty(index = 0)
    private String transactionCreationTime;


    /**
     * 交易类型
     */
    @ExcelProperty(index = 1)
    private String type;

    /**
     * 交易对方
     */
    @ExcelProperty(index = 2)
    private String counterpart ;

    /**
     * 商品名称
     */
    @ExcelProperty(index = 3)
    private String productName ;

    /**
     * 金额
     */
    @ExcelProperty(index = 4)
    private String amount ;

    /**
     * 支付类型
     */
    @ExcelProperty(index = 5)
    private String paymentType ;

    /**
     * 支付方式
     */
    @ExcelProperty(index = 6)
    private String paymentMethod;

    /**
     * 资金状态
     */
    @ExcelProperty(index = 7)
    private String fundingStatus ;

    /**
     * 交易号
     */
    @ExcelProperty(index = 8)
    private String transactionNumber;

    /**
     * 商家订单号
     */
    @ExcelProperty(index = 9)
    private String merchantOrderNumber ;


    /**
     * 备注
     */
    @ExcelProperty(index = 10)
    private String remark ;

}
