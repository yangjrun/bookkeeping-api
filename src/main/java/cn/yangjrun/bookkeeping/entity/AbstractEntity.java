package cn.yangjrun.bookkeeping.entity;

import cn.yangjrun.bookkeeping.annotation.CreateTime;
import cn.yangjrun.bookkeeping.annotation.UpdateTime;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.Date;

/**
 * 顶级实体类
 */
@Data
public abstract class AbstractEntity {

    @TableId(value = "id",type = IdType.ASSIGN_ID)
    private String id;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    @CreateTime
    private Date createTime;

    /**
     * 修改者
     */
    private String updateBy;

    /**
     * 修改时间
     */
    @UpdateTime
    private Date updateTime;

}
