package com.oops.basics;

public class Sum {

	public void findSumAvg(int[] numbers) {
		int sum = 0;
		int avg = 0;
		for (int number : numbers) {
			sum = sum + number;
		}
		avg = sum / numbers.length;

		System.out.println("Sum=" + sum + " Average=" + avg);
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Sum sum = new Sum();
		sum.findSumAvg(numbers);
	}

}
