package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.entity.BookKeeping;
import cn.yangjrun.bookkeeping.mapper.BookKeepingMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class BookKeepingServiceImplTest {

    @Autowired
    private BookKeepingMapper bookKeepingMapper;

    @Test
    void insertBookKeeping() {
        BookKeeping bookKeeping = new BookKeeping();
        bookKeeping.setTime(LocalDate.now());
        bookKeeping.setValue(new BigDecimal("60"));
        bookKeeping.setPaymentChannelId(1);
        bookKeeping.setPaymentTypeId(1);
        bookKeepingMapper.insert(bookKeeping);
    }
}