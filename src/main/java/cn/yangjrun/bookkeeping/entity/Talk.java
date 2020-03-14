package cn.yangjrun.bookkeeping.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalTime;

/**
 * 自序
 * @author jirun.yang
 * @date 2020-02-26 09:13
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Talk {

    private String id;
    /**
     * 内容
     */
    private String content;

    /**
     * 录入时间
     */
    private LocalTime time;

}
