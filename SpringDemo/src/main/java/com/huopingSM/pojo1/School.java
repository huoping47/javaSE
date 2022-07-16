package com.huopingSM.pojo1;

/*
 *com.huoping.pojo1
 *霍平
 *2022/7/10 10 21:11
 */
public class School {
    private String name;
    private String address;

    public School() {
        System.out.println("学校的无参数构造方法");
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
