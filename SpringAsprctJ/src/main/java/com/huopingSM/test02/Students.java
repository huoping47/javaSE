package com.huopingSM.test02;

/*
 *com.huoping.test02
 *霍平
 *2022/7/14 14 18:37
 */
public class Students {
    private String name;

    public Students() {
    }

    public Students(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
