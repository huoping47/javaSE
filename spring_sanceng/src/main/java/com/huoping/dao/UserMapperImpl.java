package com.huoping.dao;

import com.huoping.pojo.Users;

/*
 *com.huoping.dao
 *霍平
 *2022/7/10 10 21:58
 */
public class UserMapperImpl implements UserMapper {
    /**
     * 数据访问层的实现类
     *
     * @param users
     * @return
     */
    @Override
    public int insertUsers(Users users) {
        System.out.println(users.getUname() + "用户新增成功");
        return 1;
    }
}
