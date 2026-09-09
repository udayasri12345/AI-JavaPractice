package com.oops.basics;

public class LargeSecond {

	public void find2ndLargeNum(int[] numbers) {
		int firstLargeNum = numbers[0];
		int secondLargeNum = numbers[1];
		if(firstLargeNum>secondLargeNum)
		{
			int num=firstLargeNum;
			firstLargeNum=secondLargeNum;
			secondLargeNum=num;
		}
		for (int number : numbers) {
			if(firstLargeNum<number)
			{
				firstLargeNum=number;
			}
			else if(secondLargeNum<number)
			{
				secondLargeNum=number;
			}
		}
		 System.out.println("second Smallest number in the array is "+secondLargeNum);

	}

	public static void main(String[] args) {
		int[] numbers = new int[] {9, 7, 8, 10, 1, 2, 3, 4, 5 };

		LargeSecond largeSecond = new LargeSecond();
		largeSecond.find2ndLargeNum(numbers);
	}

}
