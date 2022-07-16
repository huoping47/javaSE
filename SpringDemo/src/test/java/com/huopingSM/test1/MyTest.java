package com.huopingSM.test1;

import com.huopingSM.pojo1.School;
import com.huopingSM.pojo1.Students;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test1
 *霍平
 *2022/7/10 10 21:15
 */
public class MyTest {
    @Test
    public void Test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1/applicationContxt.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void Test1() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean1/applicationContxt.xml");
        Students student = (Students) ac.getBean("stu");
        System.out.println(student);
    }
}
