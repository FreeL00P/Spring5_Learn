package com.fj.spring5.autowire;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 12:33    since 1.0.0
 */
public class Dept {
    private String dname;

    @Override
    public String toString() {
        return "Dept{" +
                "dname='" + dname + '\'' +
                '}';
    }

    public void setDname(String dname) {
        this.dname = dname;
    }
}
