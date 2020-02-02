/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.mokous.yunti.service.YuntiReportDbConnectInfoService;
import com.mokous.yunti.dao.YuntiReportDbConnectInfoDao;
import com.mokous.yunti.domain.YuntiReportDbConnectInfo;
import com.mokous.db.dao.CommonDao;


/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
@Service
public class YuntiReportDbConnectInfoServiceImpl extends YuntiReportDbConnectInfoService {
	@Autowired
	private YuntiReportDbConnectInfoDao yuntiReportDbConnectInfoDao;

	@Override
	public CommonDao<YuntiReportDbConnectInfo> getCommonDao(YuntiReportDbConnectInfo g) {
		return yuntiReportDbConnectInfoDao;
	}


}
