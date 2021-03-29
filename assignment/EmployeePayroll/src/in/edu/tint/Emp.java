package in.edu.tint;

public class Emp{
	private static int count = 1;
	private String name, designation, gender;
	private float baseSalary, hra, extraPay, ma;
	private int contactNumber, empId;
	private Salary ob = null;

	public Emp(String name, int contactNumber, float baseSalary, float hra, float extraPay, float ma, String designation, String gender) {
		//super();
		this.name = name;
		this.contactNumber = contactNumber;
		this.empId = count;
		this.designation = designation;
		this.gender = gender;
		count += 1;
		ob = new Salary(baseSalary, hra, extraPay, ma);
	}
	
	public Salary getSalaryObject() {
		return ob;
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

	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getName() {
		return this.name;
	}
	
	public int getEmpId() {
		return this.empId;
	}
	
	public int getContactNumber() {
		return this.contactNumber;
	}
}
