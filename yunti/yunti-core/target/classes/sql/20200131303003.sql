CREATE TABLE IF NOT EXISTS `t_yunti_report_db_info`(
    `id` int unsigned not null auto_increment,
    `db_connect_id` varchar(100) not null,
    `db_name` varchar(50) not null,
    `db_info` varchar(255) not null,
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT '数据库库信息';
