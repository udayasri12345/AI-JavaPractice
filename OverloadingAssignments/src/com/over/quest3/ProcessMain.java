package com.over.quest3;

public class ProcessMain {
	public static void main(String[] args) {
		Processor process=new Processor();
		process.calculate(8.0);
		process.calculate(2, 4);
		process.calculate(3.0, 6.0);
		process.calculate(8.0, 6);
		process.calculate(6);
	}
}
