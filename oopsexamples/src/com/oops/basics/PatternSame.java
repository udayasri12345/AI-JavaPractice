package com.oops.basics;

public class PatternSame {
	
	public static void main(String[] args) {
		int number=4;
		for(int i=1;i<=number;i++)
		{
			int n=1;
			while(n<=i)
			{
				System.out.print(i);
				n++;
			}
			System.out.print("  ");
		}
	}

}
