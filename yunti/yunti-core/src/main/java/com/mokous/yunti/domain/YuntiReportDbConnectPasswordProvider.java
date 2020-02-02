/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiReportDbConnectPasswordProvider extends DbDomain {
	private static final long serialVersionUID = -4556004533197070063L;
	private String aliasName;
	private String appid;
	private String folder;
	private String key;
	private String safe;
	private String url;
	public String getAliasName(){
		return this.aliasName;
	}
	public void setAliasName(String aliasName) {		this.aliasName = aliasName;
	}
	public String getAppid(){
		return this.appid;
	}
	public void setAppid(String appid) {		this.appid = appid;
	}
	public String getFolder(){
		return this.folder;
	}
	public void setFolder(String folder) {		this.folder = folder;
	}
	public String getKey(){
		return this.key;
	}
	public void setKey(String key) {		this.key = key;
	}
	public String getSafe(){
		return this.safe;
	}
	public void setSafe(String safe) {		this.safe = safe;
	}
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url) {		this.url = url;
	}

	@Override
	public String toString(){
		return "YuntiReportDbConnectPasswordProvider[aliasName = "+aliasName +",appid = "+appid +",folder = "+folder +",key = "+key +",safe = "+safe +",url = "+url +", toString() = "+super.toString()+ "]";
	}
}
