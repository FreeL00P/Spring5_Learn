package com.fj.spring5.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/7 22:07    since 1.0.0
 */
@Component
@Aspect//生成代理对象
public class UserProxy {
    //Before注解前置通知
    @Before(value = "execution(* com.fj.spring5.aopanno.User.add(..))")
    public void before(){
        System.out.println("before");
    }
    @After(value = "execution(* com.fj.spring5.aopanno.User.add(..))")
    public void after(){
        System.out.println("after");
    }
    @AfterReturning(value = "execution(* com.fj.spring5.aopanno.User.add(..))")
    public void afterReturning(){
        System.out.println("afterReturning");
    }
    @AfterThrowing(value = "execution(* com.fj.spring5.aopanno.User.add(..))")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }
    @Around(value = "execution(* com.fj.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("环绕前");
        proceedingJoinPoint.proceed();//执行被增强方法
        System.out.println("环绕后");
    }
}
