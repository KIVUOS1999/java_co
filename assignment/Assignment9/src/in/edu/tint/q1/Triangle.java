package in.edu.tint.q1;

public class Triangle extends Shape {
	private float t1, t2, area;

	Triangle(float t1, float t2) {
		this.t1 = t1;
		this.t2 = t2;
	}

	@Override
	public float calculateArea() {
		return ((t1 * t2) / 2);
	}

	public float getArea() {
		return area;
	}
}
