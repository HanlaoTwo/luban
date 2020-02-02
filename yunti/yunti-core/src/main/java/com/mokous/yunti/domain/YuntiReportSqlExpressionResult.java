/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportSqlExpressionResult extends DbDomain {
	private static final long serialVersionUID = -6741530621947338735L;
	private int reportSqlExpressionId;
	private int parameterIndex;
	private String parameterName;
	public int getReportSqlExpressionId(){
		return this.reportSqlExpressionId;
	}
	public void setReportSqlExpressionId(int reportSqlExpressionId) {		this.reportSqlExpressionId = reportSqlExpressionId;
	}
	public int getParameterIndex(){
		return this.parameterIndex;
	}
	public void setParameterIndex(int parameterIndex) {		this.parameterIndex = parameterIndex;
	}
	public String getParameterName(){
		return this.parameterName;
	}
	public void setParameterName(String parameterName) {		this.parameterName = parameterName;
	}

	@Override
	public String toString(){
		return "YuntiReportSqlExpressionResult[reportSqlExpressionId = "+reportSqlExpressionId +",parameterIndex = "+parameterIndex +",parameterName = "+parameterName +", toString() = "+super.toString()+ "]";
	}
}
