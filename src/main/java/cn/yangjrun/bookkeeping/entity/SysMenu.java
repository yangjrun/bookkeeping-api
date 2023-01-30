package cn.yangjrun.bookkeeping.entity;


import java.util.Date;

public class SysMenu {

    private long id;
    /**
     * 上级id，一级菜单为0
     */
    private long pid;

    /**
     * 菜单url
     */
    private String url;

    /**
     * 菜单名称
     */
    private  String menuName;

    /**
     * 授权 授权(多个用逗号分隔，如：sys:user:list,sys:user:save)
     */
    private  String permissions;

    /**
     * 类型   0：菜单   1：按钮   2：页面
     */
    private int type;

    /**
     * 菜单图标
     */
    private String icon;

    /**
     * 排序
     */
    private int sort;

    /**
     * 创建者
     */
    private String createBy;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新者
     */
    private String updateBy;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 删除标记 0 未删除 1 已删除
     */
    private boolean deleted;
}
