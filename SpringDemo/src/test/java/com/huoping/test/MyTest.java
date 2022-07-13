package com.huoping.test;

import com.huoping.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test
 *霍平
 *2022/7/10 10 20:43
 */
public class MyTest {
    @Test
    public void testStu() {
        //创建Spring容器对象,并启动该对象,执行该文件
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean/applicationContxt.xml");
        Student stu = (Student) ac.getBean("stu");
        System.out.println(stu);
    }
}
