package com.fj.spring5;

import org.junit.Test;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 15:25    since 1.0.0
 */
public class Book {
    private String bName;
    private String bAuthor;

    public void setbName(String bName) {
        this.bName = bName;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor;
    }
    public  void testDemo(){
        System.out.println("bName = " + bName);
        System.out.println("bAuthor = " + bAuthor);
    }

}
