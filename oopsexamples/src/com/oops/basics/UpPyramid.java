package com.oops.basics;

public class UpPyramid {
	
	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
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
