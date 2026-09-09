package com.oops.basics;

public class DownPyramid {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=n;i>=1;i--)
		{
			int j=i;
			while(j!=0)
			{
				System.out.print("*");
				j--;
			}
			System.out.println();
		}
	}

}
