package com.huopingSM.pojo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 *com.huoping.pojo2
 *霍平
 *2022/7/11 11 18:19
 */
public class Student {
    private String name;
    @Autowired
    @Qualifier("school")
    private School school;

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
