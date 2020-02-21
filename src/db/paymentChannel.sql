-- auto-generated definition
create table payment_channel
(
    id    varchar(50)         not null comment '主键'
        primary key,
    value varchar(30) not null comment '渠道描述'
)
    comment '支付渠道';

