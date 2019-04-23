package com.rjm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConnector {

	// DB연결과 종료
	public static Connection getConnection() throws Exception {
		String user = "user02";
		String pwd = "user02";
		String url = "jdbc:oracle:thin:@211.238.142.21:1521:xe";
		String driver = "oracle.jdbc.driver.OracleDriver";

		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, user, pwd);

		return con;
	}

	public static void disConnect(PreparedStatement st, Connection con) throws Exception {
		st.close();
		con.close();
	}

	public static void disConnect(ResultSet rs, PreparedStatement st, Connection con) throws Exception {
		rs.close();
		st.close();
		con.close();
	}
}