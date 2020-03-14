package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.PaymentChannelDao;
import cn.yangjrun.bookkeeping.entity.PaymentChannel;
import cn.yangjrun.bookkeeping.service.PaymentChannelService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 16:52
 **/
@Service
public class PaymentChannelServiceImpl implements PaymentChannelService {

    private final PaymentChannelDao paymentChannelDao;

    public PaymentChannelServiceImpl(PaymentChannelDao paymentChannelDao){
        this.paymentChannelDao = paymentChannelDao;
    }

    @Override
    public void insert(PaymentChannel paymentChannel){
        paymentChannelDao.insert(paymentChannel);
    }

    @Override
    public List<PaymentChannel> list() {
        return paymentChannelDao.list();
    }

}
