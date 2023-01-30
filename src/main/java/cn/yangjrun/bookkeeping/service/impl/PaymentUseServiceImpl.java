package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.PaymentUseDao;
import cn.yangjrun.bookkeeping.entity.PaymentUse;
import cn.yangjrun.bookkeeping.service.IPaymentUseService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-13 09:24
 **/
@Service
public class PaymentUseServiceImpl implements IPaymentUseService {

    private PaymentUseDao paymentUseDao;

    public PaymentUseServiceImpl(PaymentUseDao paymentUseDao){
        this.paymentUseDao = paymentUseDao;
    }

    @Override
    public void insert(PaymentUse paymentUse) {
        paymentUseDao.insert(paymentUse);
    }

    @Override
    public List<PaymentUse> list() {
        return paymentUseDao.list();
    }
}
