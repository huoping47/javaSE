package com.huopingSM.test01;

import com.huopingSM.test02.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test01
 *霍平
 *2022/7/14 14 18:23
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("a2/applicationContxt.xml");
        Student student = (Student) ac.getBean("studentImpl");
        student.students();
//        System.out.println(student.doSomedo("张三", 15));
    }
}
