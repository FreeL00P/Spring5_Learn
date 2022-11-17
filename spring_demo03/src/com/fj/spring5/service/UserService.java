package com.fj.spring5.service;

import com.fj.spring5.dao.UserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 14:05    since 1.0.0
 */
@Service
public class UserService {
//    @Autowired
//    @Qualifier("UserDAOImpl1")
    @Value(value = "abc")
    private String name;
    @Resource(name = "UserDAOImpl1")
    private UserDAO userDAO;
    public void add(){
        System.out.println("Service add");
        System.out.println("name = " + name);
        userDAO.add();
    }
}
