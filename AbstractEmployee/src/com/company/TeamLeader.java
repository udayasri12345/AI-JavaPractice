package com.company;

public abstract class TeamLeader extends Employee {

	double projectName;
	public TeamLeader(String empName, int empId) {
		super(empName, empId);		
	}
	
	public void appraisalDetails()
	{
		System.out.println("TeamLeader appraisal details");
	}

}

class Developer extends TeamLeader
{

	public Developer(String empName, int empId) {
		super(empName, empId);		
	}

	@Override
	void calculateBonus(int amount) {
		System.out.println("Developer Bonus calculation (amount/30)="+(amount/30));
		
	}
	
	String[] showHobbies()
	{
		return new String[]{"Learning","Reading Books","Chess player"};
	}
	}
