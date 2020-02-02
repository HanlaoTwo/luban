/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportTableInfo extends DbDomain {
	private static final long serialVersionUID = 5359965442197765224L;
	private String dbConnectId;
	private String tableName;
	private String tableInfo;
	public String getDbConnectId(){
		return this.dbConnectId;
	}
	public void setDbConnectId(String dbConnectId) {		this.dbConnectId = dbConnectId;
	}
	public String getTableName(){
		return this.tableName;
	}
	public void setTableName(String tableName) {		this.tableName = tableName;
	}
	public String getTableInfo(){
		return this.tableInfo;
	}
	public void setTableInfo(String tableInfo) {		this.tableInfo = tableInfo;
	}

	@Override
	public String toString(){
		return "YuntiReportTableInfo[dbConnectId = "+dbConnectId +",tableName = "+tableName +",tableInfo = "+tableInfo +", toString() = "+super.toString()+ "]";
	}
}
