package com.oops.basics;

public class Prime {
	
	public static void main(String[] args) {
		int number=11;boolean primeNum=true;
		for(int i=2;i<number;i++)
		{
			if(number%i==0)
			{
				primeNum=false;
				System.out.println(number+" is not a prime number");
				break;
			}
		}
		if(primeNum)
			System.out.println(number+" is a prime number");
		
		
	}

}
