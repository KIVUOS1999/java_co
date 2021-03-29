package com.edu.tint.cse.q92;

public class Main {
	public static void main(String ... args)
	{
		TollTax ob1 = new TollTax(1252, 100);
		TollTax ob2 = new TollTax(6683, 20);
		TollTax ob3 = new TollTax(4224, 1000);
		
		ob3.displayTotalTaxCollected();
		ob3.displayNoOfCars();
		ob1.displatTax();
		ob2.displatTax();
		ob3.displatTax();
		
	}
}
