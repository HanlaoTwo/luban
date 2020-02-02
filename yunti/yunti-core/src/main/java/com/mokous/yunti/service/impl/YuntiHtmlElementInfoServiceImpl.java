/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.mokous.yunti.service.YuntiHtmlElementInfoService;
import com.mokous.yunti.dao.YuntiHtmlElementInfoDao;
import com.mokous.yunti.domain.YuntiHtmlElementInfo;
import com.mokous.db.dao.CommonDao;


/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
@Service
public class YuntiHtmlElementInfoServiceImpl extends YuntiHtmlElementInfoService {
	@Autowired
	private YuntiHtmlElementInfoDao yuntiHtmlElementInfoDao;

	@Override
	public CommonDao<YuntiHtmlElementInfo> getCommonDao(YuntiHtmlElementInfo g) {
		return yuntiHtmlElementInfoDao;
	}


}
