package com.huopingSM.service.impl;

import com.huopingSM.dao.UserMapper;
import com.huopingSM.pojo.Users;
import com.huopingSM.service.UsersService;

/*
 *com.huoping.service
 *霍平
 *2022/7/10 10 22:02
 */
public class UsersServiceImpl implements UsersService {
    /**
     * 业务逻辑层的实现类
     */
    //在所有业务逻辑层中都必定有数据访问层的对象
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    //交给Spring去注入值必须提供set方法
    public void setUserMapper(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public int insertUsers(Users users) {
        return userMapper.insertUsers(users);
    }
}
