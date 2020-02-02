/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportTableColumnInfo extends DbDomain {
	private static final long serialVersionUID = -3975660044023708307L;
	private int dbConnectId;
	private int dbId;
	private int tableId;
	private String columnName;
	private String columnInfo;
	public int getDbConnectId(){
		return this.dbConnectId;
	}
	public void setDbConnectId(int dbConnectId) {		this.dbConnectId = dbConnectId;
	}
	public int getDbId(){
		return this.dbId;
	}
	public void setDbId(int dbId) {		this.dbId = dbId;
	}
	public int getTableId(){
		return this.tableId;
	}
	public void setTableId(int tableId) {		this.tableId = tableId;
	}
	public String getColumnName(){
		return this.columnName;
	}
	public void setColumnName(String columnName) {		this.columnName = columnName;
	}
	public String getColumnInfo(){
		return this.columnInfo;
	}
	public void setColumnInfo(String columnInfo) {		this.columnInfo = columnInfo;
	}

	@Override
	public String toString(){
		return "YuntiReportTableColumnInfo[dbConnectId = "+dbConnectId +",dbId = "+dbId +",tableId = "+tableId +",columnName = "+columnName +",columnInfo = "+columnInfo +", toString() = "+super.toString()+ "]";
	}
}
