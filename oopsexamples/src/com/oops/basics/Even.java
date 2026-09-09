package com.oops.basics;

public class Even {
	
	public void findEven()
	{
		int numbers=20;
		for(int number=0;number<=numbers;number++)
		if(number%2==0)
		{
			System.out.println(number);
		}
	}
	public static void main(String[] args) {
		Even even=new Even();
		even.findEven();
		
	}

}
