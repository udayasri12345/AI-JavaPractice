package com.oops.basics;

public class ReverseArray {
	public static void main(String[] args) {
		int[] numbers = new int[] { 2, 1, 3, 4, 5, 6 };
		int j = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {

			if (j >= i) {

				int num = numbers[i];// first

				numbers[i] = numbers[j];// last to first

				numbers[j] = num;// first to last

			}
			j--;

			
		}

		for (int i : numbers) {
			System.out.print(i+" ");
		}

	}

}
