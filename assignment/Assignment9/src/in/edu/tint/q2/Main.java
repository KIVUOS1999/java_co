package in.edu.tint.q2;

import java.util.Scanner;

public class Main {
	
	public static void main(String ... strings)
	{
		int sales;
		System.out.print("Enter Sales: ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		sales = sc.nextInt();sc.nextLine();
		
		Commission ob = new Commission(sales);
		float[] ans = ob.getCommission();
		System.out.println("Sales is: " + ans[0] + "\nCommision is: "+ ans[1]);
	}
}
