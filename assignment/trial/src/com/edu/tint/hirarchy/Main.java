package com.edu.tint.hirarchy;

public class Main {
	public static void main(String... strings) {
		TechnicalManager tm1 = new TechnicalManager("Head", "Aditya", 100000);
		TechnicalManager tm2 = new TechnicalManager("Super-head", "Milind", 1000000);

		HRManager hr1 = new HRManager("get_appointment", "Oishani", 100000);

		Teamhead th1 = new Teamhead(9000, "Parinita", tm1, "java_class", "team1");
		Teamhead th2 = new Teamhead(9000, "Pritam", tm1, "java_class", "team1");
		Teamhead th3 = new Teamhead(9000, "Priyajit", tm2, "java_bank", "team2");

		Developer dev1 = new Developer("Priyam", 8000, "making_vc_app", th1);
		Developer dev2 = new Developer("Rahul", 8000, "making_vc_app", th1);

		System.out.println(dev2);
	}
}
