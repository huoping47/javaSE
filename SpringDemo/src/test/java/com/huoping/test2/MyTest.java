package com.huoping.test2;

import com.huoping.pojo2.School;
import com.huoping.pojo2.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test2
 *霍平
 *2022/7/10 10 23:06
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2/applicationContxt.xml");
        School school = (School) ac.getBean("school");
        System.out.println(school);
    }

    @Test
    public void testStu() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean2/applicationContxt.xml");
        Student school = (Student) ac.getBean("stu");
        System.out.println(school);
    }
}
