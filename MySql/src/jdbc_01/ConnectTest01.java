package jdbc_01;


import java.sql.*;

/**
 * @author 霍平
 * @date 2022/6/11 23:09
 * @mouse 六月
 * 连接数据库
 */

public class ConnectTest01 {
    public static void main(String[] args){
        Connection conn = null;
        Statement stmt = null;
        try {
            //注册驱动
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            //获取连接,JDBC:MySql://表示协议，localhost就是IP地址，等同与127.0.0.1  :后面是数据库端口号
            String url="JDBC:mysql://localhost:3306/test02";
            String user = "root";
            String  password = "ZXChuoping1314.";
            conn = DriverManager.getConnection(url,user,password);
            System.out.println(conn);
            //获取连接数据库操作对象(Statement专门执行sql语句的)
            stmt = conn.createStatement();
            //执行sql语句(executeUpdate专门实行DML语句的)
            //新增数据
            String sql = "insert into t_student(age,name,sex) values(21,'zs','0')";
            //删除数据
//            String deltSql = "delete from t_student where name='zs'";
            //执行sql语句
            int relust = stmt.executeUpdate(sql);
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
