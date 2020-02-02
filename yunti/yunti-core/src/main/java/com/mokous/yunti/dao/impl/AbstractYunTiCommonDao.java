//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.dao.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import com.mokous.db.dao.AbstractCommonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * @author luofei
 * Generate 2020/1/13
 */
public abstract class AbstractYunTiCommonDao<G> extends AbstractCommonDao<G> {
    @Autowired
    @Qualifier(value = "yuntiCoreSqlSessionReadWriteFactory")
    private SqlSessionFactory sqlSessionFactory;
    public SqlSessionFactory getSqlSessionFactory() {
        return sqlSessionFactory;
    }
}
