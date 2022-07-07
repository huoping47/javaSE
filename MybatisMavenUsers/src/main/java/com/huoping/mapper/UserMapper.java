package com.huoping.mapper;

/*
 *com.huoping.mapper
 *霍平
 *2022/7/7 07 21:10
 */

import com.huoping.pojo.Users;

import java.util.List;

/**
 * 数据访问层的接口,规定数据库中可进行的各种操作
 *
 * @author 霍平
 */
public interface UserMapper {
    List<Users> getAll();
}
