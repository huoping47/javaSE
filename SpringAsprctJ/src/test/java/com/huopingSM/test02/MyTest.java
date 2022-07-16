package com.huopingSM.test02;

import com.huopingSM.test03.DoSome;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test02
 *霍平
 *2022/7/14 14 19:37
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("a3/applicationContxt.xml");
        DoSome doSpmeImpl = (DoSome) ac.getBean("doSomeImpl");
        System.out.println(doSpmeImpl.doSome("张三"));
    }
}
