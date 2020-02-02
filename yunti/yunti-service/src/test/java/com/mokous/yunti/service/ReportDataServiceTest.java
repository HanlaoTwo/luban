package com.mokous.yunti.service;

import com.mokous.base.exception.BizException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:test-applicationContext.xml"})
@ActiveProfiles("dev")
public class ReportDataServiceTest {
    @Autowired
    private ReportDataService reportDataService;

    @Test
    public void execute() throws BizException {
        int reportId = 1;
        reportDataService.execute(reportId);
    }
}
