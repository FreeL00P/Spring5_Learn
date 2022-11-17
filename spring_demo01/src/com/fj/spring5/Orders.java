package com.fj.spring5;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 15:41    since 1.0.0
 */
public class Orders {
    private String oName;
    private String addRess;

    public Orders(String oName, String addRess) {
        this.oName = oName;
        this.addRess = addRess;
    }
    public void testDemo(){
        System.out.println("oName = " + oName);
        System.out.println("addRess = " + addRess);
    }
}
