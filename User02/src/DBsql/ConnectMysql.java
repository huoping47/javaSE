package DBsql;

import java.sql.*;
import java.util.ResourceBundle;

/**
 * @author 霍平
 * @date 2022/6/22 21:14
 * @mouse 六月
 */

public class ConnectMysql {
	private static ResourceBundle rb = ResourceBundle.getBundle("sqls");
	private static String driver = rb.getString("driver");
	private static String url = rb.getString("url");
	private static String user = rb.getString("user");
	private static String password = rb.getString("password");


		static {
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				throw new RuntimeException(e);
			}
		}

		public static Connection getConn() throws SQLException {
			Connection conn = DriverManager.getConnection(url,user,password);
			return conn;
		}

		public static void closeSql(ResultSet rs, PreparedStatement ps,Connection conn){
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
