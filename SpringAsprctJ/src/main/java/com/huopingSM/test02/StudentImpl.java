package com.huopingSM.test02;

import org.springframework.stereotype.Component;

/*
 *com.huoping.test02
 *霍平
 *2022/7/14 14 18:18
 */
@Component
public class StudentImpl implements Student {

    @Override
    public String doSomedo(String name, Integer age) {
        System.out.println("doSome执行");
        return "abcd";
    }

    @Override
    public Students students() {
        System.out.println("students执行");
        return new Students("张三");
    }
}
