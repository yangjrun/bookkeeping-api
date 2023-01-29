package cn.yangjrun.bookkeeping.listener;

import cn.yangjrun.bookkeeping.dao.AlipayBillDao;
import cn.yangjrun.bookkeeping.dao.BookKeepingDao;
import cn.yangjrun.bookkeeping.dto.AlipayBillDTO;
import cn.yangjrun.bookkeeping.entity.AlipayBill;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.fastjson.JSON;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 处理支付宝账单数据
 */
@Component
public class AlipayBillReadDataListener extends AnalysisEventListener<AlipayBillDTO> {

    private static  AlipayBillDao alipayBillDao;

    public AlipayBillReadDataListener() {
    }

    @Autowired
    public  AlipayBillReadDataListener(AlipayBillDao alipayBillDao){
        this.alipayBillDao = alipayBillDao;
    }

    private static final Logger LOG = LoggerFactory.getLogger(AlipayBillReadDataListener.class);

    /**
     * 开始读取行数
     */
    private static final int START_LINE_NUMBER = 3;

    /**
     * 账单数据结束标记
     */
    private static  final CharSequence END_MARK = "------------------------------------------------------------------------------------";

    /**
     * 初始化行数
     */
    private int dataLineNumber = 0;

    /**
     * 当前数据是否读取完毕
     */
    private boolean isEnd = false;

    @Override
    public void invoke(AlipayBillDTO alipayBillEntity, AnalysisContext analysisContext) {
        if(alipayBillEntity.getTransactionNumber().contentEquals(END_MARK)){
            isEnd = true;
        }
        if(dataLineNumber <= START_LINE_NUMBER || isEnd){
            dataLineNumber ++;
        }else{
            AlipayBill alipayBill = new AlipayBill();
            BeanUtils.copyProperties(alipayBillEntity,alipayBill);
            alipayBillDao.insert(alipayBill);
            LOG.info("获取到一条数据：{}", JSON.toJSONString(alipayBillEntity));

        }
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {
        LOG.info("数据读取完毕");
    }

}
