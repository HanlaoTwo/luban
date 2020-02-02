/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.domain;

import com.mokous.base.domain.model.DbDomain;

/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
public class YuntiHtmlElementInfo extends DbDomain {
	private static final long serialVersionUID = -5633991415678903153L;
	private String name;
	private String type;
	public String getName(){
		return this.name;
	}
	public void setName(String name) {		this.name = name;
	}
	public String getType(){
		return this.type;
	}
	public void setType(String type) {		this.type = type;
	}

	@Override
	public String toString(){
		return "YuntiHtmlElementInfo[name = "+name +",type = "+type +", toString() = "+super.toString()+ "]";
	}
}
