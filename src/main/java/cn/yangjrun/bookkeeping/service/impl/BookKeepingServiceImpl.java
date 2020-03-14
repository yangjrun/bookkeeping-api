package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.BookKeepingDao;
import cn.yangjrun.bookkeeping.dto.BookKeepingDTO;
import cn.yangjrun.bookkeeping.entity.BookKeeping;
import cn.yangjrun.bookkeeping.service.BookKeepingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-02-21 14:05
 **/
@Service
public class BookKeepingServiceImpl implements BookKeepingService {

    private final BookKeepingDao bookKeepingDao;

    public BookKeepingServiceImpl(BookKeepingDao bookKeepingDao){
        this.bookKeepingDao = bookKeepingDao;
    }

    @Override
    public void insert(BookKeeping bookKeeping){
        bookKeeping.setTime(LocalDateTime.now());
        bookKeepingDao.insert(bookKeeping);
    }

    @Override
    public List<BookKeepingDTO> list(){
        return bookKeepingDao.list();
    }

}
