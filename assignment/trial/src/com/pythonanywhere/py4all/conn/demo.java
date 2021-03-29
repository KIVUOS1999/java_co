package com.pythonanywhere.py4all.conn;

import java.sql.*;
import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		Connection c = null;
		Statement stmt = null;

		int flag = 0;

		try {
			Class.forName("org.postgresql.Driver");
			c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Test", "postgres", "ss123546");
			stmt = c.createStatement();

			while (flag == 0) {
				int opt;
				Scanner sc = new Scanner(System.in);
				opt = sc.nextInt();
				if (opt == 0) {
					ResultSet rs = stmt.executeQuery("SELECT * FROM contact;");
					while (rs.next()) {
						String name = rs.getString("name");
						int number = rs.getInt("number");

						System.out.println("NAME = " + name);
						System.out.println("NUMBER = " + number);
					}

					rs.close();
					System.out.println();
				} else {
					System.out.println("Enter name: ");
					sc.nextLine();
					String name = sc.nextLine();
					System.out.println("Enter phone number: ");
					int pno = sc.nextInt();
					sc.nextLine();
					String query = "INSERT INTO contact "
			                + "VALUES(?,?)";
					try (PreparedStatement psd = c.prepareStatement(query);) {
						System.out.println("1");
						psd.setString(1, name);
						System.out.println("2");
						psd.setInt(2, pno);
						System.out.println("3");
						psd.executeBatch();
						System.out.println(psd);
					}
				}
			}

			stmt.close();
			c.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
			System.exit(0);
		}
		System.out.println("Opened database successfully");

	}
}
