package com.bankingaoo;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	void withdraw(double amount)
	{
		System.out.println("Withdraw in savings");
		balance-=amount;
	}
	@Override
	void deposit(double amount)
	{
		System.out.println("Deposit in savings");
		balance+=amount;
	}
	
	
	

}
