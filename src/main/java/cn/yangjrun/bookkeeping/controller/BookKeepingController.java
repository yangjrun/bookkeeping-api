package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.dto.BookKeepingDTO;
import cn.yangjrun.bookkeeping.entity.BookKeeping;
import cn.yangjrun.bookkeeping.service.IBookKeepingService;
import cn.yangjrun.bookkeeping.service.consts.ServicePathConst;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author jirun.yang
 * @date 2020-02-21 14:55
 **/
@RestController
@RequestMapping(ServicePathConst.PREFIX_SERVICE_PATH)
public class BookKeepingController {

    private final IBookKeepingService IBookKeepingService;

    public BookKeepingController(IBookKeepingService IBookKeepingService){
        this.IBookKeepingService = IBookKeepingService;
    }

    @PostMapping("/bookKeeping")
    @ResponseStatus(HttpStatus.CREATED)
    public void install(@RequestBody BookKeeping bookKeeping){
        IBookKeepingService.insert(bookKeeping);
    }

    @GetMapping("/bookKeeping")
    public List<BookKeepingDTO> list(){
        return IBookKeepingService.list();
    }

}
