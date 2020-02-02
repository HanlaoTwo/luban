//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.sql;

import com.mokous.yunti.domain.YuntiReportDbConnectInfo;
import com.mokous.yunti.domain.YuntiReportDbConnectPasswordProvider;
import com.mokous.yunti.enums.EnumsConnectPasswordType;
import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * @author luofei
 * Generate 2020/1/31
 */
@Configuration
public class DataSourceConfig {
    private static final long WAIT_EVICTION_MILLIS = 50000l;

    public static BasicDataSource dynamicDataSource(YuntiReportDbConnectInfo yuntiReportDbConnectInfo,
            YuntiReportDbConnectPasswordProvider yuntiReportDbConnectPasswordProvider) {
        BasicDataSource basicDataSource = new BasicDataSource();
        //jdbc配置
        basicDataSource.setDriverClassName(yuntiReportDbConnectInfo.getDriverClass());
        basicDataSource.setUrl(yuntiReportDbConnectInfo.getJdbcUrl());
        basicDataSource.setUsername(yuntiReportDbConnectInfo.getJuser());
        if (EnumsConnectPasswordType.enumByValue(yuntiReportDbConnectInfo.getJpasswordType())
                == EnumsConnectPasswordType.DIRECT_PASSWORD) {
            basicDataSource.setPassword(yuntiReportDbConnectInfo.getJpasswordValue());
        } else {
            //TODO
        }


        basicDataSource.setMaxIdle(Long.valueOf(yuntiReportDbConnectInfo.getMaxActive()).intValue());
        basicDataSource.setMinIdle(Long.valueOf(yuntiReportDbConnectInfo.getMinIdle()).intValue());
        basicDataSource.setInitialSize(Long.valueOf(yuntiReportDbConnectInfo.getInitialSize()).intValue());
        basicDataSource.setMaxWaitMillis(WAIT_EVICTION_MILLIS);
        basicDataSource.setTimeBetweenEvictionRunsMillis(WAIT_EVICTION_MILLIS);
        basicDataSource.setMinEvictableIdleTimeMillis(WAIT_EVICTION_MILLIS);
        basicDataSource.setTestWhileIdle(true);
        basicDataSource.setTestOnBorrow(true);
        basicDataSource.setTestOnReturn(true);
        basicDataSource.setValidationQuery("SELECT 'x'");
        basicDataSource.setPoolPreparedStatements(true);
        basicDataSource.setMaxTotal(Long.valueOf(yuntiReportDbConnectInfo.getMaxActive()).intValue());


        return basicDataSource;
    }

    public static DataSourceTransactionManager transactionManager(YuntiReportDbConnectInfo yuntiReportDbConnectInfo,
            YuntiReportDbConnectPasswordProvider yuntiReportDbConnectPasswordProvider) {
        return new DataSourceTransactionManager(
                dynamicDataSource(yuntiReportDbConnectInfo, yuntiReportDbConnectPasswordProvider));
    }

    static final String CONFIG_LOCATION = "classpath:ibatis/global-yunti-sql-config.xml";

    public static SqlSessionFactory sqlSessionFactory(DataSource dynamicDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dynamicDataSource);
        sessionFactory.setConfigLocation(new PathMatchingResourcePatternResolver().getResource(CONFIG_LOCATION));
        return sessionFactory.getObject();
    }

}
