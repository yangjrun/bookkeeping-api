package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.entity.PaymentChannel;
import cn.yangjrun.bookkeeping.service.PaymentChannelService;
import cn.yangjrun.bookkeeping.service.consts.ServicePathConst;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-03-05 17:15
 **/
@RestController
@RequestMapping(ServicePathConst.PREFIX_SERVICE_PATH)
public class PaymentChannelController {

    private final PaymentChannelService paymentChannelService;

    public PaymentChannelController(PaymentChannelService paymentChannelService){
        this.paymentChannelService = paymentChannelService;
    }

    @GetMapping("/paymentChannel")
    public List<PaymentChannel> list(){
        return paymentChannelService.list();
    }


}
