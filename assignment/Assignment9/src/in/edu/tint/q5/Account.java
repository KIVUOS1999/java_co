package in.edu.tint.q5;

import java.time.LocalDate;

public class Account {
	private static int count = 1;
	private int account_number ;
	public float balance = 0;
	public LocalDate last_updation_date;

	Account() {
		account_number = count;
		last_updation_date = LocalDate.now();
		count+=1;
	}

	Account(float balance) {
		account_number += 1;
		last_updation_date = LocalDate.now();
		this.balance = balance;
	}
	
	int getAccount()
	{
		return(account_number);
	}
}
