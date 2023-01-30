package cn.yangjrun.bookkeeping.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jirun.yang
 * @date 2020-03-04 14:10
 **/
@RestController
public class AxiosController {

    @GetMapping("/axios/test")
    public String test(){
        return "axiosTest";
    }

}
