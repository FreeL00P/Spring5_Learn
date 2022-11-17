package com.fj.spring5;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 20:54    since 1.0.0
 */
public class UserDaoImpl implements UserDAO{

    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行了" );
        return a+b;
    }

    @Override
    public String update(String id) {
        System.out.println("update方法执行了" );
        return id;
    }
}
