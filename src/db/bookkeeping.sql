-- auto-generated definition
create table book_keeping
(
    id                 varchar(50)     not null comment '主键
'
        primary key,
    time               date    not null comment '支付时间
',
    value              decimal not null comment '支付金额',
    payment_type_id    int     not null comment '支付类型',
    payment_channel_id int     not null comment '支付渠道
'
)
    comment '记账表';

