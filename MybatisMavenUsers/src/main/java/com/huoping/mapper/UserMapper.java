package com.huoping.mapper;

/*
 *com.huoping.mapper
 *霍平
 *2022/7/7 07 21:10
 */

import com.huoping.pojo.Users;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据访问层的接口,规定数据库中可进行的各种操作
 *
 * @author 霍平
 */
public interface UserMapper {
    /**
     * 查询所有数据的方法
     * 在mapper.xml文件中使用
     *
     * @return
     */
    List<Users> getAll();

    /**
     * 修改数据的方法
     *
     * @param users
     * @return
     */
    int update(Users users);

    /**
     * 新增数据的方法
     *
     * @param users
     * @return
     */
    int insert(Users users);

    /**
     * 根据ID查询的方法
     *
     * @param id
     * @return
     */
    Users getId(Integer id);

    /**
     * 模糊查询
     *
     * @param name
     * @return
     */
    List<Users> getName(String name);

    /**
     * 删除数据
     *
     * @param id
     * @return
     */
    int delete(Integer id);

    /**
     * 根据列名模糊查询数据  ,  可根据名字列模糊查询,也可根据其他列模糊查询
     */
    List<Users> getByVague(@Param("vague") String vague, @Param("vagueValue") String vagueValue);

    /**
     * 根据不同条件查询数据
     */
    List<Users> getCondition(Users users);
}