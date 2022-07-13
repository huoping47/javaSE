package com.huoping.pojo2;

/*
 *com.huoping.pojo1
 *霍平
 *2022/7/10 10 21:11
 */
public class School {
    private String name;
    private String address;

    //使用带参的构造方法注入值

    public School(String name, String address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

}
