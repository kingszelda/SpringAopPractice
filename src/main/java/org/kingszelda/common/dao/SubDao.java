package org.kingszelda.common.dao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by shining.cui on 2017/7/15.
 */
@Repository
public class SubDao {

    private static final AtomicInteger count = new AtomicInteger(0);

    private static final Logger logger = LoggerFactory.getLogger(SubDao.class);

    public void insert(int first, int second, int result) {
        logger.info("新增记录到减法表中，当前序列id = {}，first={}, second={}, result = {}",
                count.incrementAndGet(), first, second, result);
    }

}
