-- auto-generated definition
create table payment_type
(
    id    varchar(50)         not null comment '主键'
        primary key,
    value varchar(30) not null comment '类型描述'
)
    comment '支付类型';
