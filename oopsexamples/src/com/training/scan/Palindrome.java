package com.training.scan;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter word to check if palindrome:");
		String word=sc.next();
		int index=0;int paliWord=0;
		for(int i=word.length()-1;i>=0;i--)
		{
			if(word.charAt(index)!=word.charAt(i))
			{
				paliWord=1;
				break;
			}
		}
		if(paliWord==0)
			System.out.println(word+" is a palindrome");
		else
			System.out.println(word+" is not a palindrome");

	}
	
}
