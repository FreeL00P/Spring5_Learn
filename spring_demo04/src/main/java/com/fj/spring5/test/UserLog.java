package com.fj.spring5.test;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/9 12:06    since 1.0.0
 */
public class UserLog {
    private static final Logger log= LoggerFactory.getLogger(UserLog.class);
    @Test
    public void test() {
        log.info("hello log4j2");
        log.warn("hello log4j2");
    }
}
