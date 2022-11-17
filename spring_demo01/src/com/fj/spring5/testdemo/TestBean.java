package com.fj.spring5.testdemo;

import com.fj.spring5.bean.Emp;
import com.fj.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 20:42    since 1.0.0
 */
public class TestBean {
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        //获取配置创建对象
        Emp emp = context.getBean("emp", Emp.class);
        System.out.println(emp);
        emp.add();
    }
}
