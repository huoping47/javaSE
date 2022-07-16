package com.huopingSM.test03;

import org.springframework.stereotype.Component;

/*
 *com.huoping.test03
 *霍平
 *2022/7/14 14 19:30
 */
@Component
public class DoSomeImpl implements DoSome {
    @Override
    public String doSome(String name) {
        System.out.println("目标方法=" + name);
        return "abc";
    }
}
