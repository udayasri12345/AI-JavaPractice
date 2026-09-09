package com.oops.basics;

public class PatternDiff {
	
	public int printpattern(int space,int number,int i)
	{
		
		while(space!=0)
		{
			if(i<=number)
			{
				System.out.print(i);
				i++;
				space--;
			}
		}
		System.out.print(" ");
		return i;
	}
	
	public static void main(String[] args) {
		int number=14;int i=1;int space=1;
		PatternDiff diff=new PatternDiff();
		while(i!=number)
		{
			i=diff.printpattern(space, number,i);
			space+=1;
		}
	}

}
