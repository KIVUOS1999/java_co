package com.edu.tint.hirarchy;

public class HRManager extends Employee{
	private String role;
	HRManager(String role, String name, int salary)
	{
		super(name, salary);
		this.role = role;
	}
	public String getRole()
	{
		return role;
	}
}
