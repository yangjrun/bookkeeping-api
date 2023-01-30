package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.entity.PaymentChannel;
import cn.yangjrun.bookkeeping.service.IPaymentChannelService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class IPaymentChannelServiceImplTest {

    @Autowired
    private IPaymentChannelService paymentChannelService;

    @Test
    void insert() {
        PaymentChannel paymentChannel = new PaymentChannel();
        paymentChannel.setValue("建设银行储蓄卡");
        paymentChannelService.insert(paymentChannel);
    }
}