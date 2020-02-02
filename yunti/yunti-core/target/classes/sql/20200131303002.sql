CREATE TABLE IF NOT EXISTS `t_yunti_report_db_connect_password_provider`(
    `id` int unsigned not null auto_increment,
    `alias_name` varchar(100) not null,
    `appid` varchar(255) not null,
    `folder` varchar(100) not null,
    `key` VARCHAR(10) not null default "PASSWORD" COMMENT "password,provider",
    `safe` varchar(100) not null,
    `url` varchar(100) not null default "wall,stat,log4j",
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT '数据库连接密码服务提供信息';
