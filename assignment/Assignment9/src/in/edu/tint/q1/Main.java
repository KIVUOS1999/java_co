package in.edu.tint.q1;

public class Main {
	public static void main(String... strings) {
		float triangle_b = 5, triangle_h = 4;
		float rectangle_b = 3, rectangle_l = 7;

		Triangle tri = new Triangle(triangle_b, triangle_h);
		Rectangle rec = new Rectangle(rectangle_b, rectangle_l);

		float tri_ans = tri.calculateArea();
		tri.display(tri_ans);

		float rec_ans = rec.calculateArea();
		tri.display(rec_ans);

	}
}
