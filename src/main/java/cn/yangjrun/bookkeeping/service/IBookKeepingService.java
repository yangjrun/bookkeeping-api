package cn.yangjrun.bookkeeping.service;

import cn.yangjrun.bookkeeping.dto.BookKeepingDTO;
import cn.yangjrun.bookkeeping.entity.BookKeeping;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-02-21 14:05
 **/
public interface IBookKeepingService {

    /**
     * 新增 记账记录
     * @param bookKeeping 记账数据
     */
    void insert(BookKeeping bookKeeping);

    /**
     * 获取所有的资金消费记录
     * @return 资金消费记录集合
     */
    List<BookKeepingDTO> list();
}
