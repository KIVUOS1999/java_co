package in.edu.tint.q2;

import java.util.Scanner;

public class Singleton {
	private static int current_object_count = 0;
	private static int max_object_count = -1;
	private static Singleton ob1;

	private Singleton() {
	}

	public static Singleton getInstance() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		if (max_object_count == -1) {
			System.out.printf("Enter max_object_count: ");
			max_object_count = sc.nextInt();
			sc.nextLine();
		}
		if (current_object_count < max_object_count) {
			Singleton ob = new Singleton();
			current_object_count += 1;
			ob1 = ob;
		}
		return ob1;
	}

	public void del() {
		if (current_object_count > 0) {
			current_object_count -= 1;

		}
	}
}
