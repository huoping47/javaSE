package DBSql;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author 霍平
 * @date 2022/6/19 17:22
 * @mouse 六月
 * 配置数据库类
 */

public class Pro {
	private static ResourceBundle rb = ResourceBundle.getBundle("sql");
	private static String driver = rb.getString("driver");
	private static String url = rb.getString("url");
	private static String user = rb.getString("user");
	private static String password = rb.getString("password");

	static{
		try {
			//注册驱动
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new RuntimeException(e);
		}
	}

	public static Connection getCon() throws SQLException {
		//获取连接
		Connection conn  = DriverManager.getConnection(url,user,password);
		return conn;
	}

	public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
		if (rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				throw new RuntimeException(e);
			}
		}
		if (ps != null) {
			try {
				ps.close();
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
