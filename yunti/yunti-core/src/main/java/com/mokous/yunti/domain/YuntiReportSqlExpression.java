/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportSqlExpression extends DbDomain {
	private static final long serialVersionUID = -4248450895296880640L;
	private String name;
	private String expressionSql;
	private int dbConnectId;
	public String getName(){
		return this.name;
	}
	public void setName(String name) {		this.name = name;
	}
	public String getExpressionSql(){
		return this.expressionSql;
	}
	public void setExpressionSql(String expressionSql) {		this.expressionSql = expressionSql;
	}
	public int getDbConnectId(){
		return this.dbConnectId;
	}
	public void setDbConnectId(int dbConnectId) {		this.dbConnectId = dbConnectId;
	}

	@Override
	public String toString(){
		return "YuntiReportSqlExpression[name = "+name +",expressionSql = "+expressionSql +",dbConnectId = "+dbConnectId +", toString() = "+super.toString()+ "]";
	}
}
