package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.entity.PaymentUse;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-13 09:21
 **/
@Mapper
public interface PaymentUseDao {

    /**
     * 新增付款用途
     * @param paymentUse 付款用途信息
     */
    void insert(PaymentUse paymentUse);

    /**
     *  获取所有的付款用途
     * @return 付款用途信息集合
     */
    List<PaymentUse> list();
}
