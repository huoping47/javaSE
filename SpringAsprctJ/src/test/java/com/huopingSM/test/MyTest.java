package com.huopingSM.test;

import com.huopingSM.test01.Some;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test
 *霍平
 *2022/7/13 13 19:19
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("a1/applicationContxt.xml");
        Some some = (Some) ac.getBean("someImpl");
        System.out.println(some.getClass());
        System.out.println(some.doSome("zhangsan", 21));
        System.out.println("--------------------");
    }

    @Test
    public void test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("a1/applicationContxt.xml");
        Some some = (Some) ac.getBean("someImpl");
        System.out.println(some.getClass());
        some.doOther();
    }
}
