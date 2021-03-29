package in.edu.tint.q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int capacity;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Booking ob = new Booking();

		System.out.print("Enter total number of seats: ");
		capacity = sc.nextInt();
		sc.nextLine();

		ob.setFullCapacity(capacity);
		ob.assignSeat();
		ob.assignSeat();
		ob.assignSeat();

		System.out.println(ob.getRemainingCapacity());
	}
}
