CREATE TABLE IF NOT EXISTS `t_yunti_html_element_info`(
    `id` int unsigned not null auto_increment,
    `name` varchar(50) not null,
    `type` varchar(500) not null,
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT 'HTML控件类型信息';
