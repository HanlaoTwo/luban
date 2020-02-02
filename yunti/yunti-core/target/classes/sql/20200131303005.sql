CREATE TABLE IF NOT EXISTS `t_yunti_report_table_column_info`(
    `id` int unsigned not null auto_increment,
    `db_connect_id` int not null,
    `db_id` int not null,
    `table_id` int not null,
    `column_name` varchar(50) not null,
    `column_info` varchar(255) not null,
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT '数据库表字段信息';
