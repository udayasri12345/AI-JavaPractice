package com.oops.basics;

public class Greeter {
	
	void printMessage(String... names)
	{
		for (String name : names) {
			System.out.println("Great Day, "+name);
		}
		
	}
	
	void greetUser(String name,String... messages)
	{
		for (String message : messages) {
			System.out.println(message+" Hello "+name+",Welcome "+name+",Bye Bye Priya!");
		}
	}
	
	public static void main(String[] args) {
		Greeter greeter=new Greeter();
		greeter.printMessage("Udaya","Sri","Vasu");
		greeter.printMessage("Dinesh");
		greeter.greetUser("Udaya", "what's up","Great you are here","greetings for the day!");
	}

}
