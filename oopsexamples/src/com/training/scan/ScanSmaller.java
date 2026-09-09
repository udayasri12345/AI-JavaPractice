package com.training.scan;

import java.io.InputStream;
import java.util.Scanner;

public class ScanSmaller {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
		System.out.println("Enter "+arrSize+" array values:");
		int smallerNumber=0;
		for(int i=0;i<arrSize;i++)
		{
			arr[i]=sc.nextInt();
			if(smallerNumber>arr[i])
			{
				smallerNumber=arr[i];
			}
		}
		System.out.println("Smaller Number is :"+smallerNumber);
		
	}

}
