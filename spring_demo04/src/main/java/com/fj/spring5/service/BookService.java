package com.fj.spring5.service;

import com.fj.spring5.dao.BookDao;
import com.fj.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/8 14:06    since 1.0.0
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;
    public void addBook(Book book){
        bookDao.addBook(book);
    }
}
