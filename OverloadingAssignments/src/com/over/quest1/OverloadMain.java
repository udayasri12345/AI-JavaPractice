package com.over.quest1;

import java.util.Scanner;

public class OverloadMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// emp1
		Employee emp1 = new Employee();
		System.out.println("Enter Employee Name : ");
		emp1.name = sc.next();
		System.out.println("Enter Employee designation(Manager/Programmer/Director): ");
		emp1.designation = sc.next();
		
		//emp2
		Employee emp2 = new Employee();
		System.out.println("Enter Employee Name : ");
		emp2.name = sc.next();
		System.out.println("Enter Employee designation(Manager/Programmer/Director): ");
		emp2.designation = sc.next();
		
		//emp3
		Employee emp3 = new Employee();
		System.out.println("Enter Employee Name : ");
		emp3.name = sc.next();
		System.out.println("Enter Employee designation(Manager/Programmer/Director): ");
		emp3.designation = sc.next();
		
		//emp4
		Employee emp4 = new Employee();
		System.out.println("Enter Employee Name : ");
		emp4.name = sc.next();
		System.out.println("Enter Employee designation(Manager/Programmer/Director): ");
		emp4.designation = sc.next();
		
		//emp5
		Employee emp5 = new Employee();
		System.out.println("Enter Employee Name : ");
		emp5.name = sc.next();
		System.out.println("Enter Employee designation(Manager/Programmer/Director): ");
		emp5.designation = sc.next();
		
		//Employee Array
		Employee[] empArray = new Employee[] { emp1, emp2, emp3, emp4, emp5 };
		
		for(Employee emp:empArray)
		{
			if(emp.designation.equals("Manager"))
			{
				System.out.println("Employee Name : "+emp.name+" Employee designation:"+emp.designation);
				emp.calcBonus(20000, "Watch");
			}
			else if(emp.designation.equals("Programmer"))
			{
				System.out.println("Employee Name : "+emp.name+" Employee designation:"+emp.designation);
				emp.calcBonus(10000);
			}
			else if(emp.designation.equals("Director"))
			{
				System.out.println("Employee Name : "+emp.name+" Employee designation:"+emp.designation);
				emp.calcBonus(40000, "Car", 20000);
			}
		}
		
	}

}
