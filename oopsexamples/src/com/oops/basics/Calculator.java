package com.oops.basics;

public class Calculator {

	/*
	 * void sum(int[] numbers) { int sum = 0; for (int i : numbers) { sum += i; }
	 * System.out.println(sum); }
	 */
	void sum(int... numbers) {
		int sum = 0;
		for (int i : numbers) {
			sum += i;
		}
		System.out.println(sum);
	}

	double square(int a) {
		return Math.pow(a, 2);
	}

}
