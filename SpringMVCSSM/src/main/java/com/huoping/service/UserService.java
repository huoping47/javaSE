package com.huoping.service;

import com.huoping.pojo.User;

import java.util.List;

/*
 *com.huoping.service.impl
 *霍平
 *2022/7/25 25 19:11
 */
public interface UserService {
    /**
     * 根据条件分页获取分页数据	url	/user/selectUserPage?userName=z&userSex=男&page=null
     */
    List<User> selectUserPage(String userName, String userSex, int stareRow);

    /**
     * 增加用户	url	/user/createUser(参数见下面)
     */
    int createUser(User user);

    /**
     * 根据用户ID删除用户	url	/user/ deleteUserById?userId= 15968162087363060
     */
    int deleteUserById(String userId);

    /**
     * 获取总行数	url	/user/getRowCount?userName=z&userSex=男
     */
    int getRowCount(String userName, String userSex);
}
