create table book_keeping
(
    id                 varchar(50) not null comment '主键
'
        primary key,
    time               date        not null comment '支付时间
',
    value              decimal     not null comment '支付金额',
    payment_type_id    varchar(50) not null comment '支付类型',
    payment_channel_id varchar(50) not null comment '支付渠道
',
    payment_use_id     varchar(50) not null
)
    comment '记账表';

INSERT INTO bookkeeping.book_keeping (id, time, value, payment_type_id, payment_channel_id, payment_use_id) VALUES ('6101c0e0-6411-11ea-92bf-98fa9bab85f3', '2020-03-12', 23, '6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3', '53662166-6411-11ea-92bf-98fa9bab85f3', '');
INSERT INTO bookkeeping.book_keeping (id, time, value, payment_type_id, payment_channel_id, payment_use_id) VALUES ('a90cfb86-64c8-11ea-b661-98fa9bab85f3', '2020-03-13', 29, '6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3', '53662166-6411-11ea-92bf-98fa9bab85f3', '');
create table payment_channel
(
    id    varchar(50) not null comment '主键'
        primary key,
    value varchar(30) not null comment '渠道描述'
)
    comment '支付渠道';

INSERT INTO bookkeeping.payment_channel (id, value) VALUES ('53662166-6411-11ea-92bf-98fa9bab85f3', '建设银行储蓄卡');
INSERT INTO bookkeeping.payment_channel (id, value) VALUES ('8cc4ddd6-5ebf-11ea-ab89-98fa9bab85f3', '支付宝');
INSERT INTO bookkeeping.payment_channel (id, value) VALUES ('cacd06ae-5ebf-11ea-ab89-98fa9bab85f3', '微信');
create table payment_type
(
    id    varchar(50) not null comment '主键'
        primary key,
    value varchar(30) not null comment '类型描述'
)
    comment '支付类型';

INSERT INTO bookkeeping.payment_type (id, value) VALUES ('6a5e11cb-5ec1-11ea-ab89-98fa9bab85f3', '支出');
INSERT INTO bookkeeping.payment_type (id, value) VALUES ('6a6649d3-5ec1-11ea-ab89-98fa9bab85f3', '收入');
create table payment_use
(
    id    varchar(50)  not null
        primary key,
    value varchar(255) not null
);

INSERT INTO bookkeeping.payment_use (id, value) VALUES ('4d7a2390-64ca-11ea-b661-98fa9bab85f3', '早餐');
INSERT INTO bookkeeping.payment_use (id, value) VALUES ('4d822517-64ca-11ea-b661-98fa9bab85f3', '午餐');
INSERT INTO bookkeeping.payment_use (id, value) VALUES ('4d831386-64ca-11ea-b661-98fa9bab85f3', '晚餐');