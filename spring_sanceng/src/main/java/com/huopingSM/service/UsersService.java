package com.huopingSM.service;

import com.huopingSM.pojo.Users;

/*
 *com.huoping.service
 *霍平
 *2022/7/10 10 21:59
 */
public interface UsersService {
    /**
     * 业务逻辑层
     *
     * @param users
     * @return
     */
    int insertUsers(Users users);
}
