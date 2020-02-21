package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.entity.BookKeeping;
import cn.yangjrun.bookkeeping.mapper.BookKeepingMapper;
import cn.yangjrun.bookkeeping.service.BookKeepingService;
import org.springframework.stereotype.Service;

/**
 * @author jirun.yang
 * @date 2020-02-21 14:05
 **/
@Service
public class BookKeepingServiceImpl implements BookKeepingService {

    private final BookKeepingMapper bookKeepingMapper;

    public BookKeepingServiceImpl(BookKeepingMapper bookKeepingMapper){
        this.bookKeepingMapper = bookKeepingMapper;
    }

    @Override
    public void insert(BookKeeping bookKeeping){
        bookKeepingMapper.insert(bookKeeping);
    }

}
