package test;

import com.huoping.pojo.User;
import com.huoping.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/*
 *test
 *霍平
 *2022/7/25 25 19:33
 */
@RunWith(SpringJUnit4ClassRunner.class)//启动Spring容器
@ContextConfiguration(locations = {"classpath:applicationContext_mapper.xml", "classpath:applicationContext_service.xml"})
public class myTest {
    @Autowired
    UserService userService;

    @Test
    public void testSelectUserPage() {
        List<User> list = userService.selectUserPage(null, null, 5);
        list.forEach(result -> System.out.println(result));
    }

    @Test
    public void testCreateUser() {
        int result = userService.createUser(new User("50", "港台澳通行证", "Zx1597534", "小红", "女", "18", "学生"));
        System.out.println(result);
    }

    @Test
    public void testDeleteUser() {
        int result = userService.deleteUserById("50");
        System.out.println(result);
    }

    @Test
    public void testGetRowCount() {
        int count = userService.getRowCount("张", null);
        System.out.println(count);
    }
}
