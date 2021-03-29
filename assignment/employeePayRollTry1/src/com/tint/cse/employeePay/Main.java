package com.tint.cse.employeePay;

import java.sql.*;
import java.util.Scanner;

public class Main {
	public static void main(String... args) throws Exception {
		Conn connection = new Conn();
		Connection con = connection.startConnection();
		Functionality ob1 = new Functionality();

		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
		} catch (Exception e) {
		}

		int flag = 0, options;
		while (flag == 0) {
			System.out.println("---Welcome to Employee Payroll System---\n" + "1. Create employee ID\n"
					+ "2. Get employee payroll\n" + "3. Get last employee details\n" + "4. Orderby\n"
					+ "5. Highest Net Pay\n" + "6. Total Net Pay\n" + "7. Total Due Pay\n"
					+ "8. Total Number of person\n" + "9. Total Number of due pay\n" + "10. Groupby\n"
					+ "11. Enter netpay range \n"+"12.Modify duepay\n" +"13. Quit\nEnter choice:");
			options = sc.nextInt();
			sc.nextLine();
			if (options == 1) {
				String name, designation, gender;
				int contactNumber;
				float baseSalary, extraPay, ma, hra, due;

				System.out.println("Enter name: ");
				name = sc.nextLine();
				System.out.println("Enter designation: ");
				designation = sc.nextLine();
				System.out.println("Enter contact number: : ");
				contactNumber = sc.nextInt();
				sc.nextLine();
				System.out.println("Enter gender: ");
				gender = sc.nextLine();
				System.out.println("Enter base salary: ");
				baseSalary = sc.nextFloat();
				sc.nextLine();
				System.out.println("Enter extra pay: ");
				extraPay = sc.nextFloat();
				sc.nextLine();
				System.out.println("Enter due: ");
				due = sc.nextFloat();
				sc.nextLine();

				hra = baseSalary * 0.40f;
				ma = baseSalary * 0.15f;

				Emp ob = new Emp(name, contactNumber, baseSalary, hra, extraPay, ma, designation, gender);
				String inp_query = "INSERT INTO employeeinfo (EmpID,EmpName,Designation,ContactNumber,Gender,BasePay,ExtraPay,HRA,MedicalAllow,DuePay,NetPay) "
						+ "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
				try (PreparedStatement psd = con.prepareStatement(inp_query);) {
					psd.setInt(1, ob.getEmpId());
					psd.setString(2, name);
					psd.setString(3, designation);
					psd.setInt(4, contactNumber);
					psd.setString(5, gender);
					psd.setFloat(6, baseSalary);
					psd.setFloat(7, extraPay);
					psd.setFloat(8, hra);
					psd.setFloat(9, ma);
					psd.setFloat(10, due);
					psd.setFloat(11, ob.getSalaryObject().calculateNetPay());
					psd.executeUpdate();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
				
			} else if (options == 2) {
				ResultSet rs = connection.getExecuteStatment("select * from employeeinfo;");
				ob1.printData(rs);
			}

			else if (options == 3) {
				ResultSet rs = ob1.detalisOfLastEmployee();
				ob1.printData(rs);
			}

			else if (options == 4) {
				System.out.println("1. orderby netpay\n2. orderby duepay\nEnter options:");
				int choise = sc.nextInt();
				sc.nextLine();
				ResultSet rs = null;
				while (rs == null) {
					if (choise == 1) {
						rs = ob1.orderBy(1);
					} else if (choise == 2) {
						rs = ob1.orderBy(2);
					} else {
						System.out.println("do proper input");
					}
				}
				ob1.printData(rs);
			}

			else if (options == 5) {
				ResultSet rs = ob1.highestNetPay();
				ob1.printData(rs);
			}

			else if (options == 6) {
				ResultSet rs = ob1.totalNetPay();
				ob1.printCount(rs);
			}

			else if (options == 7) {
				ResultSet rs = ob1.totalDuePay();
				ob1.printCount(rs);
			}

			else if (options == 8) {
				ResultSet rs = ob1.totalNumberOfPerson();
				ob1.printCount(rs);
			}

			else if (options == 9) {
				ResultSet rs = ob1.totalNumberOfDuePay();
				ob1.printCount(rs);
			}

			else if (options == 10) {
				ResultSet rs = null;
				while (rs == null) {
					System.out.println("1. Groupby designation\n2. Groupby Female\nEnter option:");
					int choise = sc.nextInt();
					sc.nextLine();
					rs = ob1.groupBy(choise);
					ob1.printData(rs);
				}
			}

			else if (options == 11) {
				float a, b;
				System.out.println("Enter range: ");
				a = sc.nextFloat();
				sc.nextLine();
				b = sc.nextFloat();
				sc.nextLine();
				ResultSet rs = ob1.rangeNetpay(a, b);
				ob1.printData(rs);
			}
			
			else if(options == 12) {
				int id;
				float amount;
				System.out.println("Enter id: ");id = sc.nextInt();sc.nextLine();
				System.out.println("Enter amount: ");amount = sc.nextFloat();sc.nextLine();
				ob1.modifyDuePay(id, amount);
			}
			
			else if (options == 13) {
				System.out.println("----Thank You!!!----");
				flag = 1;
			}
		}
	}
}