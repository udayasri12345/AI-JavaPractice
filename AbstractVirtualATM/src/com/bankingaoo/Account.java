package com.bankingaoo;

public abstract class Account {
	double balance;
	//constant
	static final String BankName = "ABC Bank";
	static String idProof = "Aadhar details";

	public Account(double balance) {
		super();
		this.balance = balance;
	}

	abstract void withdraw(double amount);

	abstract void deposit(double amount);

	double getBalance() {
		return balance;
	}

	// cannot be overridden
	final void printInfo() {
		loanApproval();
		System.out.println("Loan approved member details");
	}

	private void loanApproval() {
		System.out.println("Loan approval process");
	}
	
	static void documentsNeeded() {
		System.out.println("Id Proof needed "+ idProof);
		System.out.println("Address proof needed");
	}

}
