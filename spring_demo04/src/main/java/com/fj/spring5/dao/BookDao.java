package com.fj.spring5.dao;

import com.fj.spring5.entity.Book;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/8 14:06    since 1.0.0
 */
@Repository
public interface BookDao {
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Integer id);
}
