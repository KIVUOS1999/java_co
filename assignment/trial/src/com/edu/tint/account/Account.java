package com.edu.tint.account;

public class Account {
	private int accountnumber,balance;
	static int count = 1001;
	
	Account(int balance)
	{
		accountnumber = count;
		this.balance = balance;
		count += 1;
	}
	
	void addBalance(int amount)
	{
		balance+=amount;
		displayBalance();
	}
	
	void duductBalance(int amount)
	{
		if(balance - amount >=0)
		{
			balance -= amount;
		}
		else
			System.out.println("Not enough balance");
	}
	
	void displayBalance()
	{
		System.out.println("Available balance in: "+accountnumber +"is: "+balance);
	}
}
