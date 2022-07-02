package test;

import java.sql.*;
import java.util.ResourceBundle;
import java.util.Scanner;

/**
 * @author 霍平
 * @date 2022/6/12 13:22
 * @mouse 六月
 * 实现用户注册
 */

public class UserLogin {
    public static void main(String[] args) {
        UserLogin.userUi();
        String userName = UserLogin.userName;
        String password = UserLogin.password;
        ResourceBundle re = ResourceBundle.getBundle("JDBC");
        String driver = re.getString("driver");
        String url = re.getString("url");
        String user = re.getString("user");;
        String psw = re.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url,user,psw);
            stmt = conn.createStatement();
            String sql = "select userName,userPass from t_user where userName='"+userName+"'and userPass='"+password+"'";
            resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                String name = resultSet.getString("userName");
                String pass = resultSet.getString("userPass");
                if (name.equals(userName) && pass.equals(password)) {
                    System.out.println("登录成功");
                    return;
                }
            }
            System.out.println("请输入正确的信息");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
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
    static String userName;
    static String password;

    public static void userUi(){
        System.out.println("请输入您的用户名");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();
        System.out.println("请输入您的密码");
        password= sc.next();

    }
}











