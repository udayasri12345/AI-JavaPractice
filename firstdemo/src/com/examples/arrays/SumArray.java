package com.examples.arrays;

public class SumArray {
	
	public static void main(String[] args) {
		int [] nums= new int[5];
		nums[0]=10;
		nums[1]=20;
		nums[2]=50;
		nums[3]=30;
		nums[4]=40;
		int sum=0;
		for(int num:nums)
		{
			sum+=num;
		}
		System.out.println(sum);
		
	}
	

}
