CREATE TABLE IF NOT EXISTS `t_yunti_report_sql_expression_parameter`(
    `id` int unsigned not null auto_increment,
    `report_sql_expression_id` int not null comment 'reference t_yunti_report_sql_expression.id',
    `parameter_name` varchar(50) not null,
    `parameter_info` varchar(500) not null,
    `parameter_html_element_id` int not null comment 'reference t_yunti_html_element_info',
    `del_flag` tinyint default 0 comment '0 ok else not ok',
    `update_time` timestamp null default current_timestamp on update current_timestamp,
    `create_time` datetime default null comment '创建时间',
    PRIMARY KEY(`id`)
)Engine=InnoDB DEFAULT CHARSET=UTF8 COMMENT '报表SQL语句参数信息';
