package com.huoping.service.impl;

import com.huoping.mapper.UserMapper;
import com.huoping.pojo.User;
import com.huoping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/*
 *com.huoping.service.impl
 *霍平
 *2022/7/25 25 19:24
 */
@Service
public class UserServiceImpl implements UserService {
    //业务逻辑层一定会有数据访问层的对象
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> selectUserPage(String userName, String userSex, int stareRow) {
        return userMapper.selectUserPage(userName, userSex, stareRow);
    }

    @Override
    public int createUser(User user) {
        return userMapper.createUser(user);
    }

    @Override
    public int deleteUserById(String userId) {
        return userMapper.deleteUserById(userId);
    }

    @Override
    public int getRowCount(String userName, String userSex) {
        return userMapper.getRowCount(userName, userSex);
    }
}
