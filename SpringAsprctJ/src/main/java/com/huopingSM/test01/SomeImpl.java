package com.huopingSM.test01;

import org.springframework.stereotype.Component;

/*
 *com.huoping
 *霍平
 *2022/7/13 13 19:10
 */
@Component
public class SomeImpl implements Some {
    @Override
    public String doSome(String name, int age) {
        System.out.println("dosome执行");
        return name + age;
    }

    @Override
    public void doOther() {
        System.out.println("doOther执行");
    }
}
