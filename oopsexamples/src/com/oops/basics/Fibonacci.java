package com.oops.basics;

public class Fibonacci {

	public static void main(String[] args) {
		int a = 0;
		int b = 1;
		int sum = 0;
		System.out.println(a);
		System.out.println(b);
		for (int i = 0; i <= 100; i++) {
			sum = a + b;
			if (sum <= 100) {
				System.out.println(sum);
				a = b;
				b = sum;
			}
		}
	}

}
