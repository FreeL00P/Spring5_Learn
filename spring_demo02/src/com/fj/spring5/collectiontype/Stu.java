package com.fj.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Copyright (C), 2017-2022
 * <author>          <time>              <version>
 * 冯俊        2022/8/6 21:02    since 1.0.0
 */
public class Stu {
    private String[] course;
    private List<String> list;
    private Map<String,String> maps;
    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setCourse(String[] course) {
        this.course = course;
    }
    public void test(){
        System.out.println("Arrays.toString(course) = " + Arrays.toString(course));
        System.out.println("list = " + list);
        System.out.println("maps = " + maps);
        System.out.println("courses = " + courses);
    }
}
