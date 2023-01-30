package cn.yangjrun.bookkeeping;

import cn.yangjrun.bookkeeping.dao.AlipayBillDao;
import cn.yangjrun.bookkeeping.dao.BookKeepingDao;
import cn.yangjrun.bookkeeping.dto.AlipayBillDTO;
import cn.yangjrun.bookkeeping.dto.WeChatBillDTO;
import cn.yangjrun.bookkeeping.entity.WeChatBill;
import cn.yangjrun.bookkeeping.listener.AlipayBillReadDataListener;
import cn.yangjrun.bookkeeping.listener.WeChatBillReadDataListener;
import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.support.ExcelTypeEnum;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.nio.charset.Charset;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EasyExcelTest {

    @Autowired
    private AlipayBillDao alipayBillDao;

    @Test
    void alipayReadExcel(){
        String fileName = "C:\\Users\\yangJ\\Desktop\\alipay_record_20230129_1531\\alipay_record_20230129_1531_1.csv";
        EasyExcel.read(fileName, AlipayBillDTO.class, new AlipayBillReadDataListener()).excelType(ExcelTypeEnum.CSV).charset(Charset.forName("GBK")).sheet().doRead();
    }

    @Test
    void WeChatReadExcel(){
        String fileName = "C:\\Users\\admin\\Desktop\\微信支付账单(20230122-20230129)\\微信支付账单(20230122-20230129).csv";
        EasyExcel.read(fileName, WeChatBillDTO.class, new WeChatBillReadDataListener()).excelType(ExcelTypeEnum.CSV).charset(Charset.forName("GBK")).sheet().doRead();

    }

}
