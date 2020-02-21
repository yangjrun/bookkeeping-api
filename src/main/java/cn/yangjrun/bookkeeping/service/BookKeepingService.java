package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.entity.BookKeeping;

/**
 * @author jirun.yang
 * @date 2020-02-21 14:05
 **/
public interface BookKeepingService {

    /**
     * 新增 记账记录
     * @param bookKeeping 记账数据
     */
    void insert(BookKeeping bookKeeping);
}
