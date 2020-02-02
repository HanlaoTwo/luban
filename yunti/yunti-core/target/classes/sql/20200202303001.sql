insert into t_yunti_report_sql_expression values(null, "用户数", "select count(*) from t_user where del_flag = 0", 1, 0,now(),now());


insert into t_yunti_report_db_connect_info values(null,"com.mysql.jdbc.Driver", "jdbc:mysql://127.0.0.1:3306/db_pajkx_test?characterEncoding=utf-8&autoReconnect=true&maxReconnects=1&initialTimeout=1&failOverReadOnly=false&zeroDateTimeBehavior=convertToNull&connectTimeout=500&socketTimeout=5000", 1, "root","PASSWORD","","log4j",  10,4,4,0,NOW(),NOW());

insert into t_yunti_report_db_info values(null,1,"db_pajkx_test","TEST DATABASE",0,NOW(),NOW());

create table db_pajkx_test.t_user (id int unsigned not null auto_increment, id_type char(1) NOT NULL DEFAULT 0, del_flag tinyint unsigned not null, `update_time` timestamp null default current_timestamp on update current_timestamp,`create_time` datetime default null comment '创建时间',PRIMARY KEY(`id`))Engine=InnoDB DEFAULT CHARSET=UTF8;
