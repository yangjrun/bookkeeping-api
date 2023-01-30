package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.PaymentChannel;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 16:51
 **/
public interface IPaymentChannelService {

    /**
     * 新增 付款渠道
     * @param paymentChannel 付款渠道信息
     */
    void insert(PaymentChannel paymentChannel);

    /**
     * 获取所有付款渠道
     * @return 付款渠道集合
     */
    List<PaymentChannel> list();
}
