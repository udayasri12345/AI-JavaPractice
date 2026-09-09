package com.oops.basics;

public class SortArray {
	public static void main(String[] args) {
		int[] numbers=new int[] {2,1,4,3,6,0};
		for(int i=0;i<numbers.length;i++)
		{
			
			for(int j=i+1;j<numbers.length;j++)
			{
				int num=0;
				
				if(numbers[i]<numbers[j])
				{
					num=numbers[i];
					numbers[i]=numbers[j];
					numbers[j]=num;
				}
			}
			System.out.println(numbers[i]);
		}
	}

}
