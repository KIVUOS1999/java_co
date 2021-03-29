package com.edu.tint.hirarchy;

public abstract class Employee {
	private static int count = 1;
	private String emp_name;
	private int emp_id;
	private int emp_salary;

	Employee(String name, int salary) {
		emp_id = count;
		count += 1;
		this.emp_name = name;
		this.emp_salary = salary;
	}

	public int getID() {
		return emp_id;
	}

	public int getSalary() {
		return emp_salary;
	}

	public String getName() {
		return emp_name;
	}
}
