package com.bankingaoo;

public class Current extends Account{

	String accountType; 
	
	public Current(double balance,String accountType) {
		super(balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	void withdraw(double amount) {
		System.out.println("Withdrawing:");
		balance=balance-amount-100;		
	}

	@Override
	void deposit(double amount) {
		System.out.println("Deposit");
		balance=balance+amount+50;
	}
	
	String[] showLoanType()
	{
		return new String[] {"short term","long term","vehicle loan"};
	}

	
	
	
}
