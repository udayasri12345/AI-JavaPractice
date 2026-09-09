package com.training.scan;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		String[] names = new String[] { "Udaya", "Dinesh", "Sri", "Kasula" };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username to login:");
		String loginname = sc.next();
		int exist = 0;
		for (String name : names) {
			if (name.equals(loginname)) {
				System.out.println("You are logged in successfully");
				exist = 1;
				break;
			}
		}
		if (exist == 0) {
			System.out.println("Invalid username");
		}
	}

}
