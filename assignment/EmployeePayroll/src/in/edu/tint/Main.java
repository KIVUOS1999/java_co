package in.edu.tint;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {		
	static ArrayList<Emp> emp = new ArrayList<Emp>();	
	
	public static void main(String...args) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
		}
		catch (Exception e) {
		}
		int flag = 0, options;
		while(flag == 0)
		{
			System.out.println("1. Create employee ID\n2. Get employee payroll\n3. Modify employee payroll\n4. Quit\nEnter choise");
			options = sc.nextInt();sc.nextLine();
			if(options == 1) {
				String name, designation, gender; 
				int contactNumber;
				float baseSalary, extraPay, ma, hra;
				
				System.out.println("Enter name: ");name = sc.nextLine();
				System.out.println("Enter designation: ");designation = sc.nextLine();
				System.out.println("Enter contact number: : ");contactNumber = sc.nextInt();sc.nextLine();
				System.out.println("Enter gender: ");gender = sc.nextLine();
				System.out.println("Enter base salary: ");baseSalary = sc.nextFloat();sc.nextLine();
				System.out.println("Enter extra pay: ");extraPay = sc.nextFloat();sc.nextLine();
				
				hra = baseSalary * 0.40f;
				ma = baseSalary * 0.15f;
				
				Emp ob = new Emp(name,contactNumber,baseSalary,hra,extraPay, ma,designation, gender);
				emp.add(ob);
			}
			else if(options == 2) {
				for(Emp i: emp) {
					System.out.println(i.getEmpId()+" " +i.getName()+" "+ i.getGender()+" " + i.getDesignation()+" " + i.getContactNumber()+" " + i.getSalaryObject().calculateNetPay());
				}
			}
			else if(options == 3) {
				int modify; 
				float changed;
				System.out.println("Enter employee id");int id = sc.nextInt();sc.nextLine();
				
				Emp person = null;
				int foundemp = 0;
				for(Emp i : emp) {
					if(i.getEmpId() == id) {
						person = i;
						foundemp = 1;
						break;
					}
				}
				if(foundemp == 1) {
					System.out.println("1. Modify Base salary\n2. Modify extra pay\n3. back to main menu\nEnter choice:\n");modify = sc.nextInt();sc.nextLine();
					if(modify == 1) {
						System.out.println("Enter new base salary: ");changed = sc.nextFloat();sc.nextLine();
						person.getSalaryObject().setBaseSalary(changed);
					}
					else if(modify == 2) {
						System.out.println("Enter new extra pay");changed = sc.nextFloat();sc.nextLine();
						person.getSalaryObject().setBonus(changed);
					}
					else if(modify == 3) {
						continue;
					}
					else {
						System.out.println("invalid Entry");
					}
				}
				else {
					System.out.println("Employee is not found");
				}
			}
			else if(options == 4){
				System.out.println("END");
				flag = 1;
			}
		}
	}
}
