package in.edu.tint.q4;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		Car ob = new Car(10);
		Car ob1 = new Car(10);
		Car ob2 = new Car(10);

		ob.entry();
		Thread.sleep(2000);
		ob1.entry();
		Thread.sleep(2000);
		ob2.entry();
		Thread.sleep(2000);

		ob.getCarsInParking();

		ob.leave();
		Thread.sleep(2000);
		ob1.leave();
		Thread.sleep(5000);
		ob2.leave();
	}

}
