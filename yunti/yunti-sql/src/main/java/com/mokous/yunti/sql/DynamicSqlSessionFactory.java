//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.sql;

import com.mokous.base.domain.model.DbFields;
import com.mokous.yunti.domain.YuntiReportDbConnectInfo;
import com.mokous.yunti.domain.YuntiReportDbConnectPasswordProvider;
import com.mokous.yunti.enums.EnumsConnectPasswordType;
import com.mokous.yunti.service.YuntiReportDbConnectInfoService;
import com.mokous.yunti.service.YuntiReportDbConnectPasswordProviderService;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luofei
 * Generate 2020/2/1
 */
@Service
public class DynamicSqlSessionFactory implements InitializingBean {
    @Autowired
    private YuntiReportDbConnectInfoService yuntiReportDbConnectInfoService;
    @Autowired
    private YuntiReportDbConnectPasswordProviderService yuntiReportDbConnectPasswordProviderService;
    private static final Map<Integer, SqlSessionFactory> DB_SQL_SESSION_FACTORY_MAP = new HashMap<>();

    @Override
    public void afterPropertiesSet() throws Exception {
        List<YuntiReportDbConnectInfo> yuntiReportDbConnectInfoList = yuntiReportDbConnectInfoService
                .listDirectFromDb(null);
        for (YuntiReportDbConnectInfo yuntiReportDbConnectInfo : yuntiReportDbConnectInfoList) {
            if (yuntiReportDbConnectInfo.getDelFlag() != DbFields.DEL_FLAG_OK) {
                continue;
            }
            YuntiReportDbConnectPasswordProvider yuntiReportDbConnectPasswordProvider = null;
            if (EnumsConnectPasswordType.enumByValue(yuntiReportDbConnectInfo.getJpasswordType())
                    == EnumsConnectPasswordType.PROVIDER_PASSWORD) {
                yuntiReportDbConnectPasswordProvider = yuntiReportDbConnectPasswordProviderService
                        .getDirectFromDb(Integer.parseInt(yuntiReportDbConnectInfo.getJpasswordValue()));
            }
            SqlSessionFactory sqlSessionFactory = DataSourceConfig
                    .sqlSessionFactory(DataSourceConfig
                            .dynamicDataSource(yuntiReportDbConnectInfo, yuntiReportDbConnectPasswordProvider));
            DB_SQL_SESSION_FACTORY_MAP.put(yuntiReportDbConnectInfo.getId(), sqlSessionFactory);
        }
    }

    public SqlSessionFactory getSqlSession(int dbConnectId) {
        return DB_SQL_SESSION_FACTORY_MAP.get(Integer.valueOf(dbConnectId));
    }
}
