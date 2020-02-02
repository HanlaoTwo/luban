//Copyright © 2016 - 2020 luofei86@gmail.com All Rights Reserved.罗飞 版本所有
package com.mokous.yunti.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author luofei
 * Generate 2020/1/31
 */
@RestController
@RequestMapping("/yunti/")
public class YuntiController {
    private static final Logger logger = LoggerFactory.getLogger(YuntiController.class);

    @RequestMapping("/data")
    @ResponseBody
    public void execute(String id){

    }

}
