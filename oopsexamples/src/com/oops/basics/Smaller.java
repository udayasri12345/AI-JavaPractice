package com.oops.basics;

public class Smaller {

	public int findSmaller(int[] numbersArray) {
		int small = numbersArray[0];
		for (int i : numbersArray) {
			
			if(i<small)
			{
				small=i;
			}
		}

		return small;
	}

	public static void main(String[] args) {

		int[] numbersArray = new int[] { 1, 2, 3, 4, 5 };
		Smaller smaller = new Smaller();
		int smallerNumber = smaller.findSmaller(numbersArray);
		System.out.println("Among the number {1,2,3,4,5},  " + smallerNumber + " is smaller number!");

	}

}
