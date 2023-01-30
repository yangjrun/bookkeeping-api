package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.entity.PaymentUse;
import cn.yangjrun.bookkeeping.service.IPaymentUseService;
import cn.yangjrun.bookkeeping.service.consts.ServicePathConst;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-13 09:37
 **/
@RestController
@RequestMapping(ServicePathConst.PREFIX_SERVICE_PATH)
public class PaymentUseController {

    private final IPaymentUseService paymentUseService;

    public PaymentUseController(IPaymentUseService paymentUseService){
        this.paymentUseService = paymentUseService;
    }

    @GetMapping("/paymentUse")
    public List<PaymentUse> list(){
        return paymentUseService.list();
    }

}
