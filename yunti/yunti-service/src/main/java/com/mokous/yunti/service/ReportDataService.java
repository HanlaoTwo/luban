//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.service;

import com.mokous.base.exception.BizException;
import com.mokous.db.utils.SQLParameterUtils;
import com.mokous.db.utils.SQLUtils;
import com.mokous.yunti.domain.YuntiReportSqlExpression;
import com.mokous.yunti.domain.YuntiReportSqlExpressionResult;
import com.mokous.yunti.sql.DynamicSqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author luofei
 * Generate 2020/1/31
 */
@Service
public class ReportDataService {
    @Autowired
    private YuntiReportSqlExpressionService yuntiReportSqlExpressionService;
    @Autowired
    private DynamicSqlSessionFactory dynamicSqlSessionFactory;
    @Autowired
    private YuntiReportSqlExpressionResultService yuntiReportSqlExpressionResultService;

    private static final String EXPRESSION_ID = "selectBySqlExpression";

    //
    public void execute(int reportId) throws BizException {
        YuntiReportSqlExpression yuntiReportSqlExpression = yuntiReportSqlExpressionService.getDirectFromDb(reportId);
        if (yuntiReportSqlExpression == null) {
            return;
        }

        SqlSessionFactory sqlSessionFactory = dynamicSqlSessionFactory
                .getSqlSession(yuntiReportSqlExpression.getDbConnectId());
        String sqlParameter = yuntiReportSqlExpression.getExpressionSql();
        Map<String, String> parameter = new HashMap<>();
        parameter.put("sqlExpression", sqlParameter);
        List<?> datas = sqlSessionFactory.openSession().selectList(EXPRESSION_ID, parameter);
        if(CollectionUtils.isEmpty(datas)){
            return;
        }
        System.out.println(datas);
        YuntiReportSqlExpressionResult yuntiReportSqlExpressionResult = new YuntiReportSqlExpressionResult();
        yuntiReportSqlExpressionResult.setReportSqlExpressionId(yuntiReportSqlExpression.getId());
        List<YuntiReportSqlExpressionResult> yuntiReportSqlExpressionResultList  = yuntiReportSqlExpressionResultService.listDirectFromDb(yuntiReportSqlExpressionResult);
        System.out.println(yuntiReportSqlExpressionResultList);

    }
}
