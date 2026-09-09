package com.oops.basics;

public class Reverse {
public static void main(String[] args) {
	int number=12773;int num=0;int reverse=0;
	while(number!=0)
	{
		int digit=number%10;//3
		System.out.println("digit="+digit);
		number=number/10;//12
		System.out.println("number="+number);
		num+=digit;
		System.out.println("num="+num);
		num=num*10;
		
	}
}
}
