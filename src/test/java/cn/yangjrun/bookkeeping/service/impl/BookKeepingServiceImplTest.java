package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.BookKeepingDao;
import cn.yangjrun.bookkeeping.entity.BookKeeping;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookKeepingServiceImplTest {

    @Autowired
    private BookKeepingDao bookKeepingDao;

    @Test
    void insertBookKeeping() {
        BookKeeping bookKeeping = new BookKeeping();
        bookKeeping.setTime(LocalDateTime.now());
        bookKeeping.setValue(new BigDecimal("60"));
        bookKeeping.setPaymentChannelId("11");
        bookKeeping.setPaymentTypeId("111");
        bookKeepingDao.insert(bookKeeping);
    }

    @Test
    void list(){
        bookKeepingDao.list().forEach(bookKeeping -> System.out.println(bookKeeping));
    }

}