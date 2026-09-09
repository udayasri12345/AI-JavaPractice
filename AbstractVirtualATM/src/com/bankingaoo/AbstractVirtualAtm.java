package com.bankingaoo;

import java.util.Scanner;

public class AbstractVirtualAtm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(Account.BankName);//call static final variable
		Account.documentsNeeded();//call static method
		System.out.println(Account.idProof);// print static variable
		
		
		System.out.println("Choose s for savings and \'c\' for current");
		String choice = sc.next();
		Account account = null;
		
		if (choice.equalsIgnoreCase("S")) {
			// super class ref = sub class object
			account = new Savings(20000);
		} else {
			account = new Current(10000, "Current");
			// create a ref of current and downcast
			Current current = (Current) account;
			// call own method of current
			String[] loans = current.showLoanType();
			for (String loan : loans)
				System.out.println(loan);
		}
		account.printInfo();

		while (true) {
		System.out.println("Enter 1.withdraw \n2.deposit \n3.Balance \n4.Exit");

		int type = sc.nextInt();
		
			switch (type) {
			case 1: {
				System.out.println("Enter the amount");
				double amount = sc.nextDouble();
				account.withdraw(amount);
				break;
			}
			case 2: {
				System.out.println("Enter the amount");
				double amount = sc.nextDouble();
				account.deposit(amount);
				break;
			}
			case 3: {
				System.out.println("Your balance");
				System.out.println(account.getBalance());
				break;
			}
			case 4: {
				System.exit(0);
				break;
			}
			}
		}
	}

}
