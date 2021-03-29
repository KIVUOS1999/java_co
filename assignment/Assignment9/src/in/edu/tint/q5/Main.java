package in.edu.tint.q5;

public class Main {

	public static void main(String[] args) {
		Account a1 = new Account();
		Account a2 = new Account(10.2f);

		Transaction t1 = new Transaction(a1);
		Transaction t2 = new Transaction(a2);

		t1.addBalance(100);
		t2.addBalance(1000);

		t1.getBalance();
		t2.getBalance();

		t1.subBalance(40.2f);
		t2.subBalance(100000f);

		t1.getBalance();
		t2.getBalance();
	}

}
