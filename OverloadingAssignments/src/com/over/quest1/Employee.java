package com.over.quest1;

public class Employee {
	
	String name;
	String designation;
	
	void calcBonus(double basicAllowance)
	{
		System.out.println("Basic Allowance ="+ basicAllowance);
	}
	
	void calcBonus(double basicAllowance, String gift)
	{
		System.out.println("Basic Allowance ="+ basicAllowance +" Gift="+gift);
	}
	
	void calcBonus(double basicAllowance, String gift, double houseAllowance)
	{
		System.out.println("Basic Allowance ="+ basicAllowance +" Gift="+gift+" house allowance="+houseAllowance);
	}

}
