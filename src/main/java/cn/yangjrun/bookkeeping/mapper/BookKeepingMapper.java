package cn.yangjrun.bookkeeping.mapper;

import cn.yangjrun.bookkeeping.entity.BookKeeping;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author jirun.yang
 * @date 2020-02-21 11:33
 **/
public interface BookKeepingMapper extends Mapper<BookKeeping>, MySqlMapper<BookKeepingMapper> {

    /**
     * save 数据保存
     * @param bookKeeping 记账实体
     * @return id值
     */
    @Override
    int insert(BookKeeping bookKeeping);



}
