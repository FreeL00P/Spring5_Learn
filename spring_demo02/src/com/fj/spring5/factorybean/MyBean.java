package com.fj.spring5.factorybean;

import com.fj.spring5.collectiontype.Course;
import org.springframework.beans.factory.FactoryBean;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 22:40    since 1.0.0
 */
public class MyBean implements FactoryBean<Course> {
    @Override
    public Course getObject() throws Exception {//定义返回bean对象类型
        Course course = new Course();
        course.setCname("ABS");
        return course;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }

    @Override
    public boolean isSingleton() {
        return FactoryBean.super.isSingleton();
    }
}
