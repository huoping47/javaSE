package jdbc_01;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author 霍平
 * @date 2022/6/12 10:36
 * @mouse 六月
 * 注册驱动
 * 获取连接
 * 获取数据库操作对象
 * 执行sql
 * 获取返回结果集
 * 释放资源
 */

public class ConnectTest03 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("JDBC");
        String driver = rb.getString("driver");
        String url = rb.getString("url");
        String user = rb.getString("user");
        String password = rb.getString("password");
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册驱动
            Class.forName(driver);
            //获取连接
            conn = DriverManager.getConnection(url,user,password);
            //获取数据库操作对象
            stmt = conn.createStatement();
//            String sql = "insert into t_student(age,name,sex) values(50,'老六','男')";
            String sql ="select * from t_student";
            //执行sql语句
            ResultSet resultSet = stmt.executeQuery(sql);
            //查询结果集
            while (resultSet.next()) {
                String age = resultSet.getString("age");
                String name = resultSet.getString("name");
                String sex = resultSet.getString("sex");
                String birthday = resultSet.getString("birthday");
                System.out.println(age+"\t"+name+"\t"+sex+"\t"+birthday);
            }
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
