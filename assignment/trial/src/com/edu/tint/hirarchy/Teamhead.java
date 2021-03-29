package com.edu.tint.hirarchy;

public class Teamhead extends Employee{
	private String team_name;
	private String project_name;
	private TechnicalManager manager;	
	
	Teamhead(int salary, String name, TechnicalManager manager, String project_name, String team_name)
	{
		super(name, salary);
		this.manager = manager;
		this.project_name = project_name;
		this.team_name = team_name;
	}

	public String getTeam() {
		return team_name;
	}

	public String getProject() {
		return project_name;
	}

	public TechnicalManager getManager() {
		return manager;
	}
}
