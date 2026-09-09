package com.oops.basics;

public class Odd {
	
	public void findOdd()
	{
		int numbers=20;
		for(int number=0;number<=numbers;number++)
		if(number%2!=0)
		{
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		Odd odd=new Odd();
		odd.findOdd();
		
	}

}
