package com.huopingSM.service.impl;

import com.huopingSM.dao.UserMapper;
import com.huopingSM.dao.UserMapperImpl;
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
    private UserMapper userMapper = new UserMapperImpl();

    @Override
    public int insertUsers(Users users) {
        return userMapper.insertUsers(users);
    }
}
