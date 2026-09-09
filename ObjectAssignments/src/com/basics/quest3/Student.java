package com.basics.quest3;

public class Student {

	String name;
	String department;

	public Student(String name, String department) {
		super();
		this.name = name;
		this.department = department;
	}

	public void printDetails() {
		System.out.println("Name:" + this.name);
		System.out.println("Department:" + this.department);
	}

	public String getGrades(int[] marks) {
		int sum = 0;
		int avg = 0;

		for (int mark : marks) {
			sum = sum + mark;
		}
		avg = sum / marks.length;
		String Grade = "";
		if (avg >= 90 && avg <= 100)
			Grade = "A";
		else if (avg >= 80 && avg <= 90)
			Grade = "B";
		else if (avg >= 70 && avg <= 80)
			Grade = "C";
		else if (avg >= 60 && avg <= 70)
			Grade = "D";
		else if (avg >= 50 && avg <= 59)
			Grade = "E";
		else
			Grade = "F";

		return Grade;
	}

}
