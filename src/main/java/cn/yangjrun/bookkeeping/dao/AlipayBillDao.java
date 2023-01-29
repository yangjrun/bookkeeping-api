package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.AlipayBill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AlipayBillDao {

    /**
     * 新增 支付宝账单记录
     * @param alipayBill 账单记录
     */
    void insert(AlipayBill alipayBill);

}
