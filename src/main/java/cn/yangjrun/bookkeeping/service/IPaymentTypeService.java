package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.PaymentType;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 17:05
 **/
public interface IPaymentTypeService {

    /**
     * 新增消费类型
     * @param paymentType 消费类型
     */
    void insert(PaymentType paymentType);

    /**
     * 获取所有的 消费类型
     * @return 消费类型集合
     */
    List<PaymentType> list();

}
