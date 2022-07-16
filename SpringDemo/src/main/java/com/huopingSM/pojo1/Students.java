package com.huopingSM.pojo1;

/*
 *com.huoping.pojo1
 *霍平
 *2022/7/10 10 21:18
 */
public class Students {
    private String name;
    private School school;

    public Students() {
        System.out.println("学生的无参数构造方法......");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", school=" + school +
                '}';
    }
}
