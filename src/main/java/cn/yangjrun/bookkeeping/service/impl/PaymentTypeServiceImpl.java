package cn.yangjrun.bookkeeping.service.impl;

import cn.yangjrun.bookkeeping.dao.PaymentTypeDao;
import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.service.PaymentTypeService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 17:05
 **/
@Service
public class PaymentTypeServiceImpl implements PaymentTypeService {

    private final PaymentTypeDao paymentTypeDao;

    public PaymentTypeServiceImpl(PaymentTypeDao paymentTypeDao){
        this.paymentTypeDao = paymentTypeDao;
    }

    @Override
    public void insert(PaymentType paymentType) {
        this.paymentTypeDao.insert(paymentType);
    }

    @Override
    public List<PaymentType> list() {
        return paymentTypeDao.list();
    }
}
