package com.oops.basics;

public class Perfect {

	public boolean findPerfect(int number) {
		int factorial = 1;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (sum == number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		int number = 29;
		Perfect perfect=new Perfect();
		if(perfect.findPerfect(number))
		{
			System.out.println(number+" is a Perfect number");
		}
		else 
			System.out.println(number+" is not a Perfect number");
	}

}
