package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.PaymentTypeDao;
import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.service.PaymentTypeService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
@SpringBootTest
class PaymentTypeServiceImplTest {

    @Autowired
    private PaymentTypeService paymentTypeService;

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