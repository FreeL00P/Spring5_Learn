package com.fj.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 22:06    since 1.0.0
 */
@Component
public class User {//被增强类
    public void add(){
        System.out.println("add......" );
    }
}
