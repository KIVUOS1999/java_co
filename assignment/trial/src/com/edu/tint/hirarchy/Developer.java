package com.edu.tint.hirarchy;

public class Developer extends Employee {
	private String assigned_role;
	private float working_hrs;
	private float job_completion;
	private Teamhead teamhead;

	Developer(String name, int salary, String role, Teamhead teamhead) {
		super(name, salary);
		this.assigned_role = role;
		this.teamhead = teamhead;
	}

	public String getAssignedRoles() {
		return assigned_role;
	}

	public void setJobCompletion(float amount) {
		if (amount >= 0 && amount <= 100) {
			this.job_completion = amount;
		}
	}

	public float getJobCompletion() {
		return job_completion;
	}

	public void setWorkingHrs(float hrs) {
		this.working_hrs = hrs;
	}

	public float getWorkingHrs() {
		return working_hrs;
	}

	public Teamhead getTeamhead() {
		return teamhead;
	}

	@Override
	public String toString() {
		return "Developer [assigned_role=" + assigned_role + ", working_hrs=" + working_hrs + ", job_completion="
				+ job_completion + ", teamhead=" + teamhead + "]";
	}
	
	
}
