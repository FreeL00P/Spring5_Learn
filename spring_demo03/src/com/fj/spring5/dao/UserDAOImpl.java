package com.fj.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 14:47    since 1.0.0
 */
@Repository("UserDAOImpl1")
public class UserDAOImpl implements UserDAO{
    @Override
    public void add() {
        System.out.println("dao add");
    }
}
