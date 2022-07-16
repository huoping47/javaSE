package com.huopingSM.test;

import com.huopingSM.pojo.Accounts;
import com.huopingSM.pojo.Users;
import com.huopingSM.service.AccountsService;
import com.huopingSM.service.UsersService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 *com.huopingSM.test
 *霍平
 *2022/7/16 16 18:32
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContxt_service.xml");
        UsersService usersServiceImpl = (UsersService) ac.getBean("usersServiceImpl");
        int a = usersServiceImpl.insert(new Users(12, "张三", "123456"));
        System.out.println(a);
    }

    @Test
    public void testAccounts() {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContxt_service.xml");
        AccountsService accountsService = (AccountsService) ac.getBean("accountsServiceImpl");
        int num = accountsService.insert(new Accounts(2, "张三2", "啊啊啊啊啊啊啊啊"));
        System.out.println(num);
    }
}
