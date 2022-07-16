package com.huopingSM.test;

import com.huopingSM.mapper.UserMapper;
import com.huopingSM.pojo.Users;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/*
 *com.huoping.test
 *霍平
 *2022/7/7 07 21:29
 */
public class TestUsers {
    SqlSession sqlSession;
    UserMapper userMapper;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    @BeforeTest
    public void openSqlSession() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        sqlSession = sqlSes.openSession();
        userMapper = sqlSession.getMapper(UserMapper.class);

    }

    @AfterTest
    public void closeSqlSession() {
        sqlSession.close();
    }

    /**
     * 查询所有的数据测试
     */
    @Test
    public void testUsers() {
        //取出动态代理的对象,完成接口中方法的调用,实则是调用xml文件中的标签功能
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<Users> users = userMapper.getAll();
        users.forEach(user -> {
            System.out.println(user);
        });
    }

    /**
     * 修改数据的测试
     *
     * @throws ParseException
     */
    @Test
    public void testUpdate() throws ParseException {
        Users uid = new Users(7, "王五四", sdf.parse("2001-4-1"), "2", "长沙");
        userMapper.update(uid);
        sqlSession.commit();
    }

    /**
     * 新增数据
     *
     * @throws ParseException
     */

    @Test
    public void testInsert() throws ParseException {
        Users users = new Users("小绿", sdf.parse("2020-6-1"), "2", "广州");
        userMapper.insert(users);
        sqlSession.commit();
    }

    /**
     * 根据ID取出数据
     */
    @Test
    public void getId() {
        Users u = userMapper.getId(7);
        System.out.println(u);
    }


    /**
     * 模糊查询数据
     */
    @Test
    public void getByName() {
        List<Users> list = userMapper.getName("小");
        list.forEach(lists -> {
            System.out.println(lists);
        });
    }

    /**
     * 删除数据
     */
    @Test
    public void testDelete() {
        userMapper.delete(10);
        sqlSession.commit();
    }

    /**
     * 根据数据库的列名模糊查询
     */
    @Test
    public void testSelect() {
        List<Users> usersList = userMapper.getByVague("username", "张");
        usersList.forEach(lists -> {
            System.out.println(lists);
        });
    }


    @Test
    public void createUUID() {
        UUID id = UUID.randomUUID();
//        9434a533-fced-42b5-9022-6bc0379f74d2
        System.out.println(id);
    }


    /**
     * 根据不同条件查询数据
     */
    @Test
    public void testgetCondition() {
        Users users = new Users();
        users.setAddress("市");
        users.setUsername("张");
        List<Users> list = userMapper.getCondition(users);
    }

    @Test
    public void testUpdateSet() {
        Users users = new Users();
        users.setId(52);
        users.setAddress("长沙");
        userMapper.updateSet(users);
        sqlSession.commit();
    }

    /**
     * 根据ID多个查询
     */
    @Test
    public void TestGetById() {
        Integer arr[] = {1, 5};
        List<Users> list = userMapper.getByIds(arr);
        list.forEach(lists -> System.out.println(lists));
    }

    /**
     * 根据ID批量删除数据
     */
    @Test
    public void TestDeleteById() {
        Integer arr[] = {60, 61, 62};
        userMapper.deleteById(arr);
        sqlSession.commit();
    }

    /**
     * 批量新增数据
     *
     * @throws ParseException
     */
    @Test
    public void testInsertList() throws ParseException {
        List<Users> list = new ArrayList<>();
        Users users1 = new Users("小一", sdf.parse("2001-4-1"), "2", "邵阳");
        Users users2 = new Users("小二", sdf.parse("2002-4-1"), "2", "邵阳");
        Users users3 = new Users("小三", sdf.parse("2003-4-1"), "1", "邵阳");
        list.add(users1);
        list.add(users2);
        list.add(users3);
        userMapper.insertUser(list);
        sqlSession.commit();
    }

    /**
     * 查询两个日期之间的数据
     *
     * @throws ParseException
     */
    @Test
    public void getUserDate() throws ParseException {
        List<Users> list = userMapper.getUsersDate(sdf.parse("2001-1-1"), sdf.parse("2001-12-1"));
        list.forEach(lists -> System.out.println(lists));
    }


    /**
     * 根据map集合中的value取出数据
     *
     * @throws ParseException
     */
    @Test
    public void testGetByMap() throws ParseException {
        Map map = new HashMap();
        map.put("birthdayBegin", sdf.parse("2000-1-1"));
        map.put("birthdayEnd", sdf.parse("2001-12-31"));
        List<Users> list = userMapper.getUserMap(map);
        list.forEach(lists -> System.out.println(lists));
    }

    /**
     * 返回值是一个map
     */
    @Test
    public void TestGetByUserMap() {
        Map map = userMapper.getUserByMap(3);
        System.out.println(map);
        System.out.println(map.get("username"));
    }

    /**
     * 返回多行map
     */
    @Test
    public void getAllMap() {
        List<Map> list = userMapper.getAllMap();
        System.out.println(list);
        list.forEach(lists -> System.out.println(lists.get("username") + "===" + lists.get("address")));
    }
}
