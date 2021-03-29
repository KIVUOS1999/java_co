package com.edu.tint.cse.q92;

public class TollTax {
	static int noOfCars = 0;
	static float totalTaxCollected = 0;
	int number;
	int tax;

	TollTax(int id, int tax) {
		this.tax = tax;
		this.number = id;
		totalTaxCollected += tax;
		noOfCars += 1;
	}

	void displayNoOfCars() {
		System.out.println("Total no of cars passed: " + noOfCars);
	}

	void displayTotalTaxCollected() {
		System.out.println("Total Tax collected: " + totalTaxCollected);
	}
	void displatTax()
	{
		System.out.println(tax);
	}
}
