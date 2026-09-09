package com.training.scan;

public class SquareRoot {

	public int findSquare(int number) {
		int squarenum = (int) Math.sqrt(number);
		return squarenum;
	}

	public static void main(String[] args) {
		int[] numberArray = new int[] { 2, 4, 6, 8, 10, 22, 34, 54 };
		int[] squareArray = new int[numberArray.length];
		SquareRoot root=new SquareRoot();
		int index=0;
		for (int number : numberArray) {
			squareArray[index]=root.findSquare(number);
			index++;
		}
		System.out.println("The square root of each value of the given array::");
		for(int sqaureroot:squareArray)
		{
			System.out.println(sqaureroot);
		}
	}

}
