package jdbc_01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

/**
 * @author 霍平
 * @date 2022/6/12 10:02
 * @mouse 六月
 * 获取连接
 * 获取数据库操作对象
 * 执行sql
 * 返回结果集
 * 释放资源
 */

public class ConnectTest02 {
    public static void main(String[] args) {
        //注册驱动
        ResourceBundle read = ResourceBundle.getBundle("JDBC");
        String user = read.getString("user");
        String password = read.getString("password");
        String url = read.getString("url");
        String driver = read.getString("driver");
        Connection conn = null;
        Statement stmt = null;
        try {
            //反射机制注册驱动
            Class.forName(driver);
            //获取连接
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();
            String sql = "insert into t_student(age,name) values(21,'王五')";
            String deSql = "delete from t_student where name='zs'";
            //执行sql语句
            int result = stmt.executeUpdate(deSql);
            System.out.println(result >= 1 ? "成功" : "失败");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            //释放资源
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
