package cn.yangjrun.bookkeeping.controller;

import cn.yangjrun.bookkeeping.dto.BookKeepingDTO;
import cn.yangjrun.bookkeeping.entity.BookKeeping;
import cn.yangjrun.bookkeeping.service.BookKeepingService;
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

    private final BookKeepingService bookKeepingService;

    public BookKeepingController(BookKeepingService bookKeepingService){
        this.bookKeepingService = bookKeepingService;
    }

    @PostMapping("/bookKeeping")
    @ResponseStatus(HttpStatus.CREATED)
    public void install(@RequestBody BookKeeping bookKeeping){
        bookKeepingService.insert(bookKeeping);
    }

    @GetMapping("/bookKeeping")
    public List<BookKeepingDTO> list(){
        return bookKeepingService.list();
    }

}
