package com.huopingSM.service.impl;

import com.huopingSM.mapper.UsersMapper;
import com.huopingSM.pojo.Users;
import com.huopingSM.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
 *com.huopingSM.service.impl
 *霍平
 *2022/7/16 16 19:11
 */
@Service
public class UsersServiceImpl implements UsersService {
    //在所有业务逻辑层中,一定有数据访问层的对象
    @Autowired
    UsersMapper usersMapper;

    @Override
    public int insert(Users user) {
        return usersMapper.insert(user);
    }
}
