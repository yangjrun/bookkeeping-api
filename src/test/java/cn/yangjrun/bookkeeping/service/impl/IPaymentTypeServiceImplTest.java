package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.service.IPaymentTypeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
class IPaymentTypeServiceImplTest {

    @Autowired
    private IPaymentTypeService paymentTypeService;

    @Test
    void insert() {
        PaymentType paymentType = new PaymentType();
        paymentType.setValue("支出");
        paymentTypeService.insert(paymentType);
        paymentType = new PaymentType();
        paymentType.setValue("收入");
        paymentTypeService.insert(paymentType);
    }

    @Test
    void list() {
        paymentTypeService.list().forEach(System.out::println);
    }
}