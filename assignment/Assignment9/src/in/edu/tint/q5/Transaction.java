package in.edu.tint.q5;

import java.time.LocalDate;

public class Transaction extends Account {
	Account ac;

	public Transaction(Account a) {
		this.ac = a;
	}

	void addBalance(float amount) {
		ac.balance += amount;
	}

	void subBalance(float amount) {
		if (ac.balance - amount >= 0) {
			ac.balance -= amount;
			ac.last_updation_date = LocalDate.now();
		} else
			System.out.println(" Not enough Blanace");
	}

	void getBalance() {
		System.out.println(" Available balance: " + ac.balance + " Last Updation date: " + ac.last_updation_date);
	}
}
