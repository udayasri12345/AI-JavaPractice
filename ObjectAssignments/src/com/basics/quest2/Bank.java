package com.basics.quest2;

public class Bank {
	
	double balance;

	public Bank(double balance) {
		super();
		this.balance = balance;
	}
	
	public void withdraw(double amount)
	{
		this.balance=this.balance-amount;
	}
	
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	
	
	

}
