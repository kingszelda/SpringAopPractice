package org.kingszelda.version1.controller;

import org.kingszelda.version1.service.MethodCounter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by shining.cui on 2017/7/15.
 */
@RestController
@RequestMapping("version1")
public class CountController {

    private static final Logger logger = LoggerFactory.getLogger(CountController.class);

    @Resource
    private MethodCounter methodCounter;

    @RequestMapping("queryCount")
    public Map<String, Integer> queryCountMap() {
        logger.info("开始查询方法调用次数");
        return methodCounter.getMethodCountMap();
    }

}
