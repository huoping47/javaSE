package com.huoping.controller;

import java.util.Date;

/*
 *com.huoping.controller
 *霍平
 *2022/7/20 20 20:21
 */
public class Student {
    private String name;
    private Date birthday;

    public Student() {

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Student(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }
}
