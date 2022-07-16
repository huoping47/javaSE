package com.huopingSM.dao;

import com.huopingSM.pojo.Users;

/*
 *com.huoping.dao
 *霍平
 *2022/7/10 10 21:52
 */
public interface UserMapper {
    /**
     * 数据访问层
     *
     * @param users
     * @return
     */
    int insertUsers(Users users);
}
