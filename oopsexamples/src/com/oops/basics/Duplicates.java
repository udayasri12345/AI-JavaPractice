package com.oops.basics;

public class Duplicates {

	public void findDublicate(int[] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			int duplicate = 0;
			for (int j = i + 1; j < numbers.length; j++) {
				if (numbers[i] == numbers[j]) {
					duplicate++;
				}
			}
			if (duplicate > 0)
				System.out.println(numbers[i]);
		}
	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 1, 3, 2, 1, 4, 2 };
		Duplicates duplicates=new Duplicates();
		System.out.println("Duplicate numbers are:");
		duplicates.findDublicate(numbers);
	}

}
