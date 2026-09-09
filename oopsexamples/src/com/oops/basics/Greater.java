package com.oops.basics;

public class Greater {

	public int findGreater(int[] numbersArray) {
		int less = numbersArray[0];
		int great = 0;
		for (int i : numbersArray) {
			System.out.println("--"+i);
			if (less > great) {
				great = less;
				if (i < numbersArray.length-1)
					less = numbersArray[i + 1];
			}
		}

		return great;
	}

	public static void main(String[] args) {

		int[] numbersArray = new int[] { 1, 2, 3, 4, 5 };
		Greater greater = new Greater();
		int greaterNumber = greater.findGreater(numbersArray);
		System.out.println("Among the number {1,2,3,4,5},  " + greaterNumber + " is greater number!");

	}

}
