package com.huoping.controller;

import com.huoping.pojo.User;
import com.huoping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/*
 *com.huoping.controller
 *霍平
 *2022/7/25 25 20:52
 */
//@Controller
@CrossOrigin   //在服务器端支持跨域访问
@RestController  //如果本类中都是ajax请求,那么可以使用RestController这个注解,方法体上的@ResponseBody可以不写
@RequestMapping("/user")
public class UserController {
    //界面层一定会有数据访问层的对象
    @Autowired
    UserService userService;
    public static final int PAGE_SIZE = 5;

    ///user/selectUserPage?userName=z&userSex=男&page=null
    @RequestMapping("/selectUserPage")
//    @ResponseBody
    public List<User> selectUserPage(String userName, String userSex, Integer page) {
        int startRow = 0;
        if (page != null) {
            startRow = (page - 1) * PAGE_SIZE;
        }
        return userService.selectUserPage(userName, userSex, startRow);
    }

    //根据用户ID删除用户	url	/user/ deleteUserById?userId= 15968162087363060
    @RequestMapping("/deleteUserById")
//    @ResponseBody
    public int deleteUserById(String userId) {
        return userService.deleteUserById(userId);
    }

    //增加用户	url	/user/createUser(参数见下面)
    @RequestMapping("createUser")
//    @ResponseBody
    public int createUser(User user) {
        String Uuid = System.currentTimeMillis() + "";
        user.setUserId(Uuid);
        return userService.createUser(user);
    }

    //获取总行数	url	/user/getRowCount?userName=z&userSex=男
    @RequestMapping("/getRowCount")
//    @ResponseBody
    public int getRowCount(String userName, String userSex) {
        return userService.getRowCount(userName, userSex);

    }
}
