package com.tint.cse.employeePay;

import java.sql.*;
import java.util.Scanner;

public class Functionality {
	Conn con = new Conn();

	public ResultSet detalisOfLastEmployee() {
		ResultSet rs = con.getExecuteStatment("select * from employeeinfo where empid=(select max(empid) from employeeinfo)");
		return rs;
	}

	public ResultSet orderBy(int option) {
		ResultSet rs = null;
		if (option == 1) {
			rs = con.getExecuteStatment("select * from employeeinfo order by netpay desc");
		} else if (option == 2) {
			rs = con.getExecuteStatment("select * from employeeinfo order by duepay desc");
		} else {
			System.out.println("Error in options");
		}
		return rs;
	}

	public ResultSet highestNetPay() {
		ResultSet rs = con
				.getExecuteStatment("select * from employeeinfo where NetPay=(select max(NetPay) from employeeinfo)");
		return rs;
	}

	public ResultSet totalNetPay() {
		ResultSet rs = con.getExecuteStatment("select sum(netpay) from employeeinfo");
		return rs;
	}

	public ResultSet totalDuePay() {
		ResultSet rs = con.getExecuteStatment("select sum(duepay) from employeeinfo");
		return rs;
	}

	public ResultSet totalNumberOfPerson() {
		ResultSet rs = con.getExecuteStatment("select count(empid) from employeeinfo");
		return rs;
	}

	public ResultSet totalNumberOfDuePay() {
		ResultSet rs = con.getExecuteStatment("select count(duepay) from employeeinfo where duepay > 0");
		return rs;
	}

	public ResultSet groupBy(int options) {
		ResultSet rs = null;
		String data, query = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (options == 1) {
			System.out.println("Enter designation name:");
			data = sc.nextLine();
			query = "select * from employeeinfo where designation ='" + data + "';";
			rs = con.getExecuteStatment(query);
		} else if (options == 2) {
			System.out.println("Enter F/M/O:");
			data = sc.nextLine();
			query = "select * from employeeinfo where gender ='" + data + "';";
			rs = con.getExecuteStatment(query);
		}
		System.out.println(query);
		return rs;
	}

	public ResultSet rangeNetpay(float a, float b) {
		String query = "select * from employeeinfo where netpay >=" + a + "AND netpay <=" + b + ";";
		ResultSet rs = con.getExecuteStatment(query);
		return rs;
	}

	public void modifyDuePay(int id, float amount) throws SQLException {
		String query = "update employeeinfo set duepay="+Float.toString(amount) +"where empid="+Integer.toString(id)+";";
		Connection c = con.startConnection();
		Statement st = c.createStatement();
		st.executeUpdate(query);
	}
	
	public void printData(ResultSet rs){
		String userData = "";
		try { 
			while (rs.next()) {
				userData = rs.getInt(1) + "\t\t" + rs.getString(2).toUpperCase() + "\t\t" + rs.getString(3) + "\t\t"
						+ rs.getString(4) + "\t\t" + (int) rs.getDouble(5) + "\t\t" + rs.getFloat(6) + "\t\t"
						+ rs.getFloat(7) + "\t\t" + rs.getFloat(8) + "\t\t" + rs.getFloat(9) + "\t\t" + rs.getFloat(10)
						+ "\t\t" + rs.getFloat(11);
				System.out.println(userData);
			}
		} catch (SQLException e) {
			System.out.println("error");
			e.printStackTrace();
		}
	}
	
	public void printCount(ResultSet rs) throws SQLException{
		rs.next();
		System.out.println(rs.getInt(1));
	}
}
