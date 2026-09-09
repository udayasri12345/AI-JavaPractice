package com.company;

public abstract class Employee {

	static final String companyName="Amazon";
	String empName;
	int empId;
	static String city="Hyderabad";
	public Employee(String empName, int empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
	abstract void calculateBonus(int amount);
	
	static void projectDetails()
	{
		System.out.println("Employee Project details = Java Project");
	}
	
	final void salaryProcess()
	{
		System.out.println("Salary calculating process is \"Base salary+Tax+Bonus\"");
	}
	
}
