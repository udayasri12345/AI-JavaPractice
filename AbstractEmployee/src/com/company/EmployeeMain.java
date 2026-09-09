package com.company;

public class EmployeeMain {

	public static void main(String[] args) {

		System.out.println("Company Name=" + Employee.companyName);
		System.out.println("City=" + Employee.city);
		System.out.println("Calling Manager Object");
		Manager manager = new Manager("Udaya", 1111);
		manager.projectDetails();
		manager.salaryProcess();
		manager.calculateBonus(10000);
		System.out.println("Manager training details:" );
		for(String training:manager.trainingDetails())
		{
			System.out.println("                          "+training);
		}

		System.out.println("Calling Developer Class");
		Developer developer = new Developer("SriPriya", 1234);
		developer.appraisalDetails();
		developer.projectDetails();
		developer.salaryProcess();
		developer.calculateBonus(20000);
		System.out.println("Developer Hobbies=");
		for(String hobby:developer.showHobbies())
		{
			System.out.println("                  "+hobby);
		}

	}

}
