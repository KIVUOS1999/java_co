package in.edu.tint.q1;

public class Rectangle extends Shape {
	private float t1, t2, area;

	Rectangle(float t1, float t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public float calculateArea() {
		return (t1 * t2);
	}

	public float getArea() {
		return area;
	}
}
