package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.PaymentChannel;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 16:49
 **/
@Mapper
public interface PaymentChannelDao {

    /**
     * 新增付款渠道
     * @param paymentChannel 付款渠道信息
     */
    void insert(PaymentChannel paymentChannel);

    /**
     * 获取所有的付款渠道
     * @return 付款渠道
     */
    List<PaymentChannel> list();

}
