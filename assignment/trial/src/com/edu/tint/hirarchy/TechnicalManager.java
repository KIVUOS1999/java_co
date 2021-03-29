package com.edu.tint.hirarchy;

public class TechnicalManager extends Employee {
	private String designation;
	
	TechnicalManager(String designation, String name, int salary)
	{
		super(name, salary);
		this.designation = designation;
	}

	public String getDesignation() {
		return designation;
	}
}
