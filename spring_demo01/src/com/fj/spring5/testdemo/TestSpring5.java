package com.fj.spring5.testdemo;

import com.fj.spring5.Book;
import com.fj.spring5.Orders;
import com.fj.spring5.User;
import com.fj.spring5.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Or;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 12:25    since 1.0.0
 */
public class TestSpring5 {
    @Test
    public void testAdd(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建对象
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.add();
    }
    @Test
    public void testBook(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建对象
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        book.testDemo();
    }
    @Test
    public void testOrder(){
        //加载配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建对象
        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);
        order.testDemo();
    }
    @Test
    public void testUser(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //获取配置创建对象
        UserService userService= context.getBean("userService", UserService.class);
        System.out.println(userService);
        userService.add();
    }
}

