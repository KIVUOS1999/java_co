package in.edu.tint.q4;

import java.time.Duration;
import java.time.LocalTime;

public class Car {
	private static int cars_in_parking = 0;
	private float parking_charge, t;
	private LocalTime initial_entry;
	private LocalTime final_leave;

	Car(float parking_charge) {
		this.parking_charge = parking_charge;
	}

	public void entry() {
		this.initial_entry = java.time.LocalTime.now();
		cars_in_parking += 1;
	}

	public void leave() {
		this.final_leave = java.time.LocalTime.now();
		cars_in_parking -= 1;
		System.out.println(
				"Entry: " + initial_entry + 
				" Exit: " + final_leave + 
				" Duration: " + t + 
				" Charge: "	+ chargeCalculation());
	}

	private float chargeCalculation() {
		t = Duration.between(initial_entry, final_leave).toSeconds();
		return t * parking_charge;
	}

	public void getCarsInParking() {
		System.out.println(cars_in_parking);
	}
}
