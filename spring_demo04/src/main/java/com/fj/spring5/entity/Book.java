package com.fj.spring5.entity;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/8 14:13    since 1.0.0
 */
public class Book {
    private String userId;
    private String userName;
    private String uStatus;

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getuStatus() {
        return uStatus;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setuStatus(String uStatus) {
        this.uStatus = uStatus;
    }
}
