package cn.yangjrun.bookkeeping.listener;

import cn.yangjrun.bookkeeping.dao.WeChatBillDao;
import cn.yangjrun.bookkeeping.dto.WeChatBillDTO;
import cn.yangjrun.bookkeeping.entity.WeChatBill;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class WeChatBillReadDataListener extends AnalysisEventListener<WeChatBillDTO> {

    private static WeChatBillDao weChatBillDao;

    public WeChatBillReadDataListener() {
    }

    @Autowired
    public  WeChatBillReadDataListener(WeChatBillDao weChatBillDao){
        this.weChatBillDao = weChatBillDao;
    }

    private static final Logger LOG = LoggerFactory.getLogger(WeChatBillReadDataListener.class);

    /**
     * 开始读取行数
     */
    private static final int START_LINE_NUMBER = 15;

    /**
     * 初始化行数
     */
    private int dataLineNumber = 0;

    @Override
    public void invoke(WeChatBillDTO weChatBillDTO, AnalysisContext analysisContext) {
        if(dataLineNumber <= START_LINE_NUMBER){
            dataLineNumber ++;
        }else{
            WeChatBill weChatBill = new WeChatBill();
            BeanUtils.copyProperties(weChatBillDTO,weChatBill);
            weChatBillDao.insert(weChatBill);
            LOG.info("获取到一条数据：{}", JSON.toJSONString(weChatBillDTO));
        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        LOG.info("数据读取完毕");
    }
}
