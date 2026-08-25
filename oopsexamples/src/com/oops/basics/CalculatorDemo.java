package com.oops.basics;

public class CalculatorDemo {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		// int[] numbers=new int[] {1,2,3,4,5};
		calculator.sum(1, 2, 3, 4);
		calculator.sum(10, 20);
		calculator.sum(30, 40, 50);
		System.out.println(calculator.square(20));

	}

}
