package com.tint.cse.employeePay;

import java.sql.*;

public class Conn {
	private String url, uname, pass;

	Conn() {
		url = "jdbc:mysql://sql12.freemysqlhosting.net/sql12393629";
		uname = "sql12393629";
		pass = "ITw4zN3L8h";
	}

	public Connection startConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, uname, pass);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}

	public ResultSet getExecuteStatment(String query) {
		Connection con = startConnection();
		Statement st;
		ResultSet rs = null;
		try {
			st = con.createStatement();
			rs = st.executeQuery(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
