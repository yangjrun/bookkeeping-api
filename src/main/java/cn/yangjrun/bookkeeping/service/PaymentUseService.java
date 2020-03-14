package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.entity.PaymentUse;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-13 09:23
 **/
public interface PaymentUseService {

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
