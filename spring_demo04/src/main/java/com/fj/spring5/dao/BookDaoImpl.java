package com.fj.spring5.dao;

import com.fj.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/8 14:07    since 1.0.0
 */
@Repository
public class BookDaoImpl implements BookDao{
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public void addBook(Book book) {
        String sql="insert into t_book values(?,?,?);";
        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUserName(), book.getuStatus());
        System.out.println(update);
    }

    @Override
    public void updateBook(Book book) {
        String sql="update t_book set userName=?,uStatus=? where userId=?";
        jdbcTemplate.update(sql,book.getUserName(),book.getuStatus(),book.getUserId());
    }

    @Override
    public void deleteBook(Integer id) {
        String sql="delete from t_book where userId=?";
        jdbcTemplate.update(sql,id);
    }
}
