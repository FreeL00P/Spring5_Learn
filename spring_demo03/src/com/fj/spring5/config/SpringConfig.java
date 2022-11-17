package com.fj.spring5.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 15:07    since 1.0.0
 */
@Configuration//作为配置类 替代xml文件
@ComponentScan(basePackages = "com.fj")
public class SpringConfig {

}
