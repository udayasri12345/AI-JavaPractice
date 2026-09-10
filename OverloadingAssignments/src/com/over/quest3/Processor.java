package com.over.quest3;

public class Processor {
	
	void calculate(double x)
	{
		//Square root 
		System.out.println("Square root of "+x+" = "+Math.sqrt(x));
	}
	
	void calculate(int x,int y)
	{
		//Product
		System.out.println("Product of "+x+","+y+" = "+(x*y));
	}
	
	void calculate(double x, double y)
	{
		//Difference
		System.out.println("Difference of "+x+","+y+" = "+(x-y));
	}
	
	void calculate(double x,int y)
	{
		//Print x power y
		System.out.println(x+" power "+y+" = "+Math.pow(x, y));
	}
	
	void calculate(int x)
	{
		//Square
		System.out.println("Sqaure of "+x+" = "+(x*x));
	}

}
