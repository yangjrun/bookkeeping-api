package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.PaymentType;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 17:02
 **/
@Mapper
public interface PaymentTypeDao {

    /**
     * 新增付款类型
     * @param paymentType 付款类型信息
     */
    void insert(PaymentType paymentType);

    /**
     *  获取所有的付款类型
     * @return 付款类型集合
     */
    List<PaymentType> list();

}
