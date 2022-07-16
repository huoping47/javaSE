package com.huopingSM.test;

import com.huopingSM.controller.UsersController;
import com.huopingSM.pojo.Users;
import org.junit.Test;

/*
 *com.huoping.test
 *霍平
 *2022/7/10 10 22:21
 */
public class MyTest {
    @Test
    public void test() {
        UsersController users = new UsersController();
        int resule = users.insert(new Users(100, "张三", 15));
        System.out.println(resule);
    }
}
