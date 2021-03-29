package in.edu.tint.q2;

public class Commission {
	float sales, commision_rate = 0.02f;

	Commission(float sales) {
		if (sales > 0)
			this.sales = sales;
		else
			System.out.println("This sales is negative");
	}

	public float[] getCommission() {
		float[] ans = { -1, -1 };
		float deduct = this.sales * this.commision_rate;
		if (this.sales - deduct > 0) {
			this.sales = this.sales - deduct;
			ans = new float[] { this.sales, deduct };
		} else
			System.out.println("Your sales is not valid for: ");
		return ans;
	}
}
