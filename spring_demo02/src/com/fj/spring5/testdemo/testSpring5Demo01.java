package com.fj.spring5.testdemo;

import com.fj.spring5.autowire.Emp;
import com.fj.spring5.collectiontype.Book;
import com.fj.spring5.collectiontype.Course;
import com.fj.spring5.collectiontype.Stu;

import com.fj.spring5.factorybean.MyBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 21:18    since 1.0.0
 */
public class testSpring5Demo01 {

    @Test
    public void  testCollection(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        Stu stu=context.getBean("stu",Stu.class);
        stu.test();

    }
    @Test
    public void  testBook(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Book book=context.getBean("book",Book.class);
        book.show();
    }
    @Test
    public void  test3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        Course myBean =context.getBean("myBean",Course.class);
        System.out.println("myBean = " + myBean);

    }

    @Test
    public void  test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        Emp emp=context.getBean("emp",Emp.class);
        System.out.println(emp);

    }
}
