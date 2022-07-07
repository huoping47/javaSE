package org.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/*
 *org.example
 *霍平
 *2022/7/6 06 19:00
 */
public class TestUser {
    @Before
    public void before() {
//        这是在执行Test之前执行的
//        可以将重复的代码丢在这里面, 每次执行都会先执行这里面的代码
    }

    @After
    public void after() {
//        这是Test程序执行完之后执行的, 也可以将重复的代码丢在这里面, 比如关闭资源啊等等......
    }

    /**
     * 查询所有的学生
     *
     * @throws IOException
     */
    @Test
    public void oneUser() throws IOException {
        //使用文件流读取核心配置文件,sqlMapConfig.xml文件
        InputStream is = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        //取出SqlSession的对象
        SqlSession sql = factory.openSession();
        //完成查询操作
        List<UserTest> list = sql.selectList("zar.getAll");
        list.forEach(userTest -> System.out.println(userTest));
        //关闭资源
        sql.close();
    }
    //数据库已经删除

    /**
     * 根据ID查询学生
     *
     * @throws IOException
     */
    @Test
    public void twoUser() throws IOException {
        //读取核心文件配置
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建SqlSessionFactory工厂模式
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        //取出SqlSession对象
        SqlSession sql = sqlSes.openSession();
        //完成查询操作
        UserTest uid = sql.selectOne("zar.getById", 1);
        System.out.println(uid);
        //关闭资源流
        sql.close();
    }

    /**
     * 根据姓名模糊查询数据
     *
     * @throws IOException
     */
    @Test
    public void threeUser() throws IOException {
        //读取mybatis的核心配置文件
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        //创建工厂模式
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        //取出SqlSession对象
        SqlSession sqlSession = sqlSes.openSession();
        //完场查询操作
        List<UserTest> list = sqlSession.selectList("zar.getByteName", "李");
        list.forEach(userTest -> System.out.println(userTest));
        //关闭资源
        sqlSession.close();
    }

    /**
     * 新增数据
     *
     * @throws IOException
     */
    @Test
    public void insertUser() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSes.openSession();
        int a = sqlSession.insert("zar.insert", new UserTest("老六", "123456", "男", 31));
        sqlSession.commit();
        System.out.println(a);
        sqlSession.close();
    }

    /**
     * 根据ID删除数据
     *
     * @throws IOException
     */
    @Test
    public void TestDelete() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSes.openSession();
        int a = sqlSession.delete("zar.delete", 5);
        System.out.println(a);
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 更新数据
     *
     * @throws IOException
     */
    @Test
    public void TestUpdate() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactory sqlSes = new SqlSessionFactoryBuilder().build(in);
        SqlSession sqlSession = sqlSes.openSession();
        int sql = sqlSession.update("zar.update", new UserTest(6, "李六", "123456", "男", 35));
        System.out.println(sql);
        sqlSession.commit();
        sqlSession.close();

    }
}
