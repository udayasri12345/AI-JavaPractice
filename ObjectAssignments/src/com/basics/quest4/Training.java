package com.basics.quest4;

public class Training {

	public String[] showCourses() {
		return new String[] { "Java", "Python", "Data Stuctures", "JavaScript", "HTML", "Angular" };
	}

	public void showTrainers(String[] names) {
		System.out.println("Trainer names:");
		for (String name : names) {
			System.out.println(name);
		}
	}

}
