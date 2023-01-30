package cn.yangjrun.bookkeeping.dao;

import cn.yangjrun.bookkeeping.entity.WeChatBill;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WeChatBillDao {


    /**
     * 新增 微信账单记录
     * @param weChatBill 账单记录
     */
    void insert(WeChatBill weChatBill);

}
