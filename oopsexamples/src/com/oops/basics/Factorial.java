package com.oops.basics;

public class Factorial {
	
	public int findFactorial(int num)
	{
		int factorialResult=1;
		for(int n=1;n<=num;n++)
		{
			factorialResult=factorialResult*n;
		}
		
		return factorialResult;
	}
	
	public static void main(String[] args) {
		Factorial factorial=new Factorial();
		int factorialResult=factorial.findFactorial(5);
		System.out.println("The factorial result of 12 is "+factorialResult);
		
	}

}
