package com.company;

public class Manager extends Employee{

	double salary;
	
	public Manager(String empName, int empId) {
		super(empName, empId);	
		System.out.println("EmployeeName="+empName+" EmployeeID="+empId);
	}

	@Override
	void calculateBonus(int amount) {
		System.out.println("Manager Bonus calculation (amount/10)="+(amount/10));
		
	}
	
	public String[] trainingDetails()
	{
		return new String[] {"Java","Git","SpringBoot"};
	}
	

}
