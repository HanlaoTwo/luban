/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportDbInfo extends DbDomain {
	private static final long serialVersionUID = 6810854662345545200L;
	private String dbConnectId;
	private String dbName;
	private String dbInfo;
	public String getDbConnectId(){
		return this.dbConnectId;
	}
	public void setDbConnectId(String dbConnectId) {		this.dbConnectId = dbConnectId;
	}
	public String getDbName(){
		return this.dbName;
	}
	public void setDbName(String dbName) {		this.dbName = dbName;
	}
	public String getDbInfo(){
		return this.dbInfo;
	}
	public void setDbInfo(String dbInfo) {		this.dbInfo = dbInfo;
	}

	@Override
	public String toString(){
		return "YuntiReportDbInfo[dbConnectId = "+dbConnectId +",dbName = "+dbName +",dbInfo = "+dbInfo +", toString() = "+super.toString()+ "]";
	}
}
