package com.basics.quest3;

import java.util.Scanner;

public class StudentMain {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter student1 name:");
		String name=sc.next();
		System.out.println("Enter department:");
		String depatment=sc.next();
		Student student1=new Student(name, depatment);
		System.out.println("Enter all 7 subject marks:");
		int[] marks=new int[7];
		for(int i=0;i<7;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("//////////Student 1 Grade details//////////");
		student1.printDetails();
		System.out.println(student1.getGrades(marks));
		System.out.println("//////////////////////////////////////////");
		System.out.println("Enter student2 name:");
		name=sc.next();
		System.out.println("Enter department:");
		depatment=sc.next();
		Student student2=new Student(name, depatment);
		System.out.println("Enter all 7 subject marks:");
		//int[] marks=new int[7];
		for(int i=0;i<7;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("//////////Student 2 Grade details//////////");
		student2.printDetails();
		System.out.println(student2.getGrades(marks));
		System.out.println("//////////////////////////////////////////");
	}

}
