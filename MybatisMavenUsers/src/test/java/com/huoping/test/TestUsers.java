package com.huoping.test;

import com.huoping.mapper.UserMapper;
import com.huoping.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
 *com.huoping.test
 *霍平
 *2022/7/7 07 21:29
 */
public class TestUsers {
    SqlSession sqlSession;

    @BeforeTest
    public void openSqlSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSes.openSession();
    }

    @AfterTest
    public void closeSqlSession() {
        sqlSession.close();
    }

    @Test
    public void testUsers() {
        //取出动态代理的对象,完成接口中方法的调用,实则是调用xml文件中的标签功能
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Users> users = userMapper.getAll();
        users.forEach(user -> {
            System.out.println(user);
        });
    }
}
