package com.huoping.controller;

import com.huoping.pojo.Users;
import com.huoping.service.UsersService;
import com.huoping.service.impl.UsersServiceImpl;

/*
 *com.huoping.controller
 *霍平
 *2022/7/10 10 22:09
 */
public class UsersController {
    /**
     * 界面层
     * 界面层的功能实现就是对外提供访问的功能
     * 如何去访问业务逻辑层,就是创建对象
     * 所有的界面层下面都有业务逻辑层的对象
     */
    public UsersService usersService = new UsersServiceImpl();

    public int insert(Users users) {
        return usersService.insertUsers(users);
    }
}
