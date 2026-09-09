package com.basics.quest4;

import java.util.Scanner;

public class CourseMain {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("How many trainer names you want to enter:");
		int listSize=sc.nextInt();
		System.out.println("Enter Trainer names:");
		String[] names=new String[listSize];
		for(int i=0;i<listSize;i++)
		{
			names[i]=sc.next();
		}
		
		Training training=new Training();
		System.out.println("////List of trainers////");
		training.showTrainers(names);
		String[] courses=training.showCourses();
		System.out.println("////List of courses////");
		for(String course:courses)
		{
			System.out.println(course);
		}
		
		
	}

}
