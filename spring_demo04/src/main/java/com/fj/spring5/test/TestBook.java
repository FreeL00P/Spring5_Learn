package com.fj.spring5.test;

import com.fj.spring5.entity.Book;
import com.fj.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/8 14:21    since 1.0.0
 */
public class TestBook {
    @Test
    public void testJdbcTemplate(){
        ApplicationContext context=new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);
        Book book = new Book();
        book.setUserId("3");
        book.setUserName("java");
        book.setuStatus("a");
        bookService.addBook(book);
    }
}
