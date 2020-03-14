package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.dto.BookKeepingDTO;
import cn.yangjrun.bookkeeping.entity.BookKeeping;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-02-26 09:04
 **/
@Mapper
public interface BookKeepingDao {

    /**
     * 新增 资金消费记录
     * @param bookKeeping 资金记录
     */
    void insert(BookKeeping bookKeeping);

    /**
     * 获取所有的资金消费记录
     * @return 资金消费记录
     */
    List<BookKeepingDTO> list();

}
