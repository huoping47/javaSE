package com.huoping.pojo;

/*
 *com.huoping.pojo
 *霍平
 *2022/7/10 10 20:40
 */
public class Student {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
        System.out.println("Student的无参数构造方法执行......");
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
