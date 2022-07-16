package com.huopingSM.test;

import com.huopingSM.controller.UsersController;
import com.huopingSM.pojo.Users;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huoping.test
 *霍平
 *2022/7/10 10 22:21
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContxt.xml");
        UsersController Contorller = (UsersController) ap.getBean("uContorller");
        Users users = (Users) ap.getBean("users");
        Contorller.insert(users);
    }
}
