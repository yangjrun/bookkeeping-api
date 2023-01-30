package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.entity.PaymentType;
import cn.yangjrun.bookkeeping.service.IPaymentTypeService;
import cn.yangjrun.bookkeeping.service.consts.ServicePathConst;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 17:13
 **/
@RestController
@RequestMapping(ServicePathConst.PREFIX_SERVICE_PATH)
public class PaymentTypeController {

    private final IPaymentTypeService paymentTypeService;

    public PaymentTypeController(IPaymentTypeService paymentTypeService){
        this.paymentTypeService = paymentTypeService;
    }

    @GetMapping("/paymentType")
    public List<PaymentType> list(){
        return paymentTypeService.list();
    }

}
