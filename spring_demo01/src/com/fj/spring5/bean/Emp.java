package com.fj.spring5.bean;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 20:33    since 1.0.0
 */
public class Emp {
    private String ename;
    private String gender;
    private Dept dept;

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void add() {
        System.out.println("ename = " + ename);
        System.out.println("gender = " + gender);
        System.out.println("dept = " + dept);
    }
}
