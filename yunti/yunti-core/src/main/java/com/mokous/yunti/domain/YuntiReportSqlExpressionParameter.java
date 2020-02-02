/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportSqlExpressionParameter extends DbDomain {
	private static final long serialVersionUID = 4345695918713338223L;
	private int reportSqlExpressionId;
	private String parameterName;
	private String parameterInfo;
	private int parameterHtmlElementId;
	public int getReportSqlExpressionId(){
		return this.reportSqlExpressionId;
	}
	public void setReportSqlExpressionId(int reportSqlExpressionId) {		this.reportSqlExpressionId = reportSqlExpressionId;
	}
	public String getParameterName(){
		return this.parameterName;
	}
	public void setParameterName(String parameterName) {		this.parameterName = parameterName;
	}
	public String getParameterInfo(){
		return this.parameterInfo;
	}
	public void setParameterInfo(String parameterInfo) {		this.parameterInfo = parameterInfo;
	}
	public int getParameterHtmlElementId(){
		return this.parameterHtmlElementId;
	}
	public void setParameterHtmlElementId(int parameterHtmlElementId) {		this.parameterHtmlElementId = parameterHtmlElementId;
	}

	@Override
	public String toString(){
		return "YuntiReportSqlExpressionParameter[reportSqlExpressionId = "+reportSqlExpressionId +",parameterName = "+parameterName +",parameterInfo = "+parameterInfo +",parameterHtmlElementId = "+parameterHtmlElementId +", toString() = "+super.toString()+ "]";
	}
}
