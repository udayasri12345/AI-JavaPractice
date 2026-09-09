package com.training.scan;

import java.util.Scanner;

public class Registration {
	public static void main(String[] args) {
		String[] names=new String[] {"Udaya","Dinesh","Sri","Kasula"};
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name to register:");
		String Regname=sc.next();
		int exist=0;
		for (String name : names) {
			if(name.equals(Regname))
			{
				System.out.println("Name is not unique");
				exist=1;
				break;
			}
		}
		if(exist==0)
		{
			System.out.println("You are registered");
		}
	}

}
