package com.training.scan;

public class MaxOccureLetter {
public static void main(String[] args) {
	String word="hellooo";
	char letter = 0;
	int occurence=0;
	for(int i=0;i<word.length();i++)
	{
		char templetter = 0;int tempoccure=1;
		for(int j=i+1;j<word.length();j++)
		{
			if(word.charAt(i)==word.charAt(j))
			{
				templetter=word.charAt(i);
				tempoccure++;
			}
		}
		if(occurence<tempoccure)
		{
			occurence=tempoccure;
			letter=templetter;
		}
		
	}
	System.out.println(letter+" occured max of "+occurence+" times");
	
}
}
