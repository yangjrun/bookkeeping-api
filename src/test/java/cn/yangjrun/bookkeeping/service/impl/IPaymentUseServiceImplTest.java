package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.entity.PaymentUse;
import cn.yangjrun.bookkeeping.service.IPaymentUseService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class IPaymentUseServiceImplTest {

    @Autowired
    private IPaymentUseService paymentUseService;

    @Test
    void insert() {
        PaymentUse paymentUse = new PaymentUse();
        paymentUse.setValue("早餐");
        PaymentUse paymentUse2 = new PaymentUse();
        paymentUse2.setValue("午餐");
        PaymentUse paymentUse3 = new PaymentUse();
        paymentUse3.setValue("晚餐");
        paymentUseService.insert(paymentUse);
        paymentUseService.insert(paymentUse2);
        paymentUseService.insert(paymentUse3);
    }

    @Test
    void list() {
        paymentUseService.list().forEach(System.out::println);
    }
}