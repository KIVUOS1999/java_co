package com.tint.cse.employeePay;
public class Salary {
	private float baseSalary, hra, extraPay, ma;
	
	public Salary(float baseSalary, float hra, float extraPay, float ma) {
		this.baseSalary = baseSalary;
		this.hra = hra;
		this.extraPay = extraPay;
		this.ma = ma;
	}
	
	public float getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(float baseSalary) {
		this.baseSalary = baseSalary;
	}

	public float getHra() {
		return hra;
	}

	public void setHra(float hra) {
		this.hra = hra;
	}

	public float getBonus() {
		return extraPay;
	}

	public void setBonus(float bonus) {
		this.extraPay = bonus;
	}

	public float getMa() {
		return ma;
	}

	public void setMa(float ma) {
		this.ma = ma;
	}

	public float calculateNetPay() {
		return baseSalary + hra + extraPay + ma;
	}
}
