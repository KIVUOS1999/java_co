package com.tint.cse.employeePay;

import java.sql.*;

public class Emp {
	private static int count = 1;
	private String name, designation, gender;
	private float contactNumber, baseSalary, hra, extraPay, ma;
	private int empId;
	private Salary salaryOb = null;

	public Emp(String name, float contactNumber, float baseSalary, float hra, float extraPay, float ma,
			String designation, String gender) throws SQLException {
		salaryOb = new Salary(baseSalary, hra, extraPay, ma);
		count = initializeCount();
		this.name = name;
		this.contactNumber = contactNumber;
		this.empId = count;
		this.designation = designation;
		this.gender = gender;
		count += 1;
	}
	
	public Salary getSalaryObject() {
		return salaryOb;
	}
	
	private int initializeCount() throws SQLException {
		count = 1;
		String query = "select max(empid) from employeeinfo";
		Conn connection = new Conn();
		ResultSet rs = connection.getExecuteStatment(query);
		rs.next();
		count = rs.getInt(1) + 1;
		return count;
	}

	public static int getCount() {
		return count;
	}

	public String getDesignation() {
		return designation;
	}

	public String getGender() {
		return gender;
	}

	public float getBaseSalary() {
		return baseSalary;
	}

	public float getHra() {
		return hra;
	}

	public float getExtraPay() {
		return extraPay;
	}

	public float getMa() {
		return ma;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContactNumber(float contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return this.name;
	}

	public int getEmpId() {
		return this.empId;
	}

	public float getContactNumber() {
		return this.contactNumber;
	}
}
