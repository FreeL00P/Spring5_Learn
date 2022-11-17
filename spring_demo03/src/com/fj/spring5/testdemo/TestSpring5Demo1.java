package com.fj.spring5.testdemo;

import com.fj.spring5.config.SpringConfig;
import com.fj.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import java.applet.AppletContext;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 14:08    since 1.0.0
 */
public class TestSpring5Demo1 {
    @Test
    public void testService(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }
    @Test
    public void testService2(){
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);//加载配置类
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}

