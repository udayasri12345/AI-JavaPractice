package com.oops.basics;

public class SmallSecond {

	public void find2ndSmallerNumbers(int[] numbers) {
		int firstSmallNum = numbers[0];
		int secondSmallNum = numbers[1];
		if(firstSmallNum>secondSmallNum)
		{
			int num=firstSmallNum;
			firstSmallNum=secondSmallNum;
			secondSmallNum=num;
		}
		for (int number : numbers) {
			if(firstSmallNum>number)
			{
				firstSmallNum=number;
			}
			else if(secondSmallNum>number)
			{
				secondSmallNum=number;
			}
		}
		 System.out.println("second Smallest number in the array is "+secondSmallNum);

	}

	public static void main(String[] args) {
		int[] numbers = new int[] { 7, 8, 10, 1, 2, 3, 4, 5 };

		SmallSecond smallSecond = new SmallSecond();
		smallSecond.find2ndSmallerNumbers(numbers);
	}

}
