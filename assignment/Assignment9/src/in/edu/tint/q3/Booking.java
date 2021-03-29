package in.edu.tint.q3;

public class Booking {
	private int full_capacity;
	static int count = 0;

	Booking() {
		this.full_capacity = 5;
	}

	public void assignSeat() {
		if (count < full_capacity) {
			count += 1;
			System.out.println("you have been assigned seat no " + count);
		} else {
			System.out.println("no more seat is available");
		}
	}

	public void setFullCapacity(int capacity) {
		this.full_capacity = capacity;
	}

	public int getRemainingCapacity() {
		return full_capacity - count;
	}
}
