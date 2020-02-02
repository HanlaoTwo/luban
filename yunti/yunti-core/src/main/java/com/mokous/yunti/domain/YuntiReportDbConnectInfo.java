/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportDbConnectInfo extends DbDomain {
	private static final long serialVersionUID = 1116509423978508987L;
	private String driverClass;
	private String jdbcUrl;
	private int dbId;
	private String juser;
	private String jpasswordType;
	private String jpasswordValue;
	private String filters;
	private long maxActive;
	private long initialSize;
	private long minIdle;
	public String getDriverClass(){
		return this.driverClass;
	}
	public void setDriverClass(String driverClass) {		this.driverClass = driverClass;
	}
	public String getJdbcUrl(){
		return this.jdbcUrl;
	}
	public void setJdbcUrl(String jdbcUrl) {		this.jdbcUrl = jdbcUrl;
	}
	public int getDbId(){
		return this.dbId;
	}
	public void setDbId(int dbId) {		this.dbId = dbId;
	}
	public String getJuser(){
		return this.juser;
	}
	public void setJuser(String juser) {		this.juser = juser;
	}
	public String getJpasswordType(){
		return this.jpasswordType;
	}
	public void setJpasswordType(String jpasswordType) {		this.jpasswordType = jpasswordType;
	}
	public String getJpasswordValue(){
		return this.jpasswordValue;
	}
	public void setJpasswordValue(String jpasswordValue) {		this.jpasswordValue = jpasswordValue;
	}
	public String getFilters(){
		return this.filters;
	}
	public void setFilters(String filters) {		this.filters = filters;
	}
	public long getMaxActive(){
		return this.maxActive;
	}
	public void setMaxActive(long maxActive) {		this.maxActive = maxActive;
	}
	public long getInitialSize(){
		return this.initialSize;
	}
	public void setInitialSize(long initialSize) {		this.initialSize = initialSize;
	}
	public long getMinIdle(){
		return this.minIdle;
	}
	public void setMinIdle(long minIdle) {		this.minIdle = minIdle;
	}

	@Override
	public String toString(){
		return "YuntiReportDbConnectInfo[driverClass = "+driverClass +",jdbcUrl = "+jdbcUrl +",dbId = "+dbId +",juser = "+juser +",jpasswordType = "+jpasswordType +",jpasswordValue = "+jpasswordValue +",filters = "+filters +",maxActive = "+maxActive +",initialSize = "+initialSize +",minIdle = "+minIdle +", toString() = "+super.toString()+ "]";
	}
}
