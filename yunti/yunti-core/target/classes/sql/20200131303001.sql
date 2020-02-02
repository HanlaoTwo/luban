CREATE TABLE IF NOT EXISTS `t_yunti_report_db_connect_info`(
    `id` int unsigned not null auto_increment,
    `driver_class` varchar(100) not null,
    `jdbc_url` varchar(255) not null,
    `db_id` int not null comment 'reference ',
    `juser` varchar(100) not null,
    `jpassword_type` VARCHAR(10) not null default "PASSWORD" COMMENT "password,provider",
    `jpassword_value` varchar(100) not null,
    `filters` varchar(100) not null default "wall,stat,log4j",
    `max_active` int unsigned not null default 40,
    `initial_size` int unsigned not null default 10,
    `min_idle` int unsigned not null default 10,
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT '数据库连接信息';
