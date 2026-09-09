package com.basics.quest2;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		Bank bank = new Bank(0);
		int end = 0;
		while (end == 0) {
			System.out.println("Select any below action:");
			System.out.println("1.Deposit\n2.Withdraw\n3.Get balance\n4.Logout");
			int inputVal = sc.nextInt();
			switch (inputVal) {
			case 1:
				System.out.print("Enter the amount you want to deposit:");
				bank.deposit(sc.nextDouble());
				System.out.println("Your current balance is :" + bank.getBalance());
				break;
			case 2:
				System.out.print("Enter the amount you want to withdraw:");
				bank.withdraw(sc.nextDouble());
				System.out.println("Your current balance is :" + bank.getBalance());
				break;
			case 3:
				System.out.println("Your current balance is :" + bank.getBalance());
				break;
			case 4:
				System.out.println("Thank you!");
				end = 1;
				break;
			}
		}
	}
}
