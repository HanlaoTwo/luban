/**
 * Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
 */
package com.mokous.yunti.service.impl;


import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import com.mokous.yunti.service.YuntiReportTableColumnInfoService;
import com.mokous.yunti.dao.YuntiReportTableColumnInfoDao;
import com.mokous.yunti.domain.YuntiReportTableColumnInfo;
import com.mokous.db.dao.CommonDao;


/**
 * @author GEN_BY_DRAGON_BOAT 2020-02-02 18:22:31
 */
@Service
public class YuntiReportTableColumnInfoServiceImpl extends YuntiReportTableColumnInfoService {
	@Autowired
	private YuntiReportTableColumnInfoDao yuntiReportTableColumnInfoDao;

	@Override
	public CommonDao<YuntiReportTableColumnInfo> getCommonDao(YuntiReportTableColumnInfo g) {
		return yuntiReportTableColumnInfoDao;
	}


}
