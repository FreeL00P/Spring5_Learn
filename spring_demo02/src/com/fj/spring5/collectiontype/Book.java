package com.fj.spring5.collectiontype;

import java.util.List;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 22:04    since 1.0.0
 */
public class Book {
    private List<String> list;
    public void setList(List<String> list){
        this.list=list;
    }
    public void show(){
        System.out.println("list = " + list);
    }
}
