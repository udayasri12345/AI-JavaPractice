package com.training.scan;

import java.util.Scanner;

public class ScanSum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int arrSize=sc.nextInt();
		int[] arr=new int[arrSize];
		System.out.println("Enter "+arrSize+" array values:");
		int sum=0;
		for(int i=0;i<arrSize;i++)
		{
			arr[i]=sc.nextInt();
			sum+=arr[i];
			}
		System.out.println("Sum :"+sum);
		System.out.println("Avg :"+sum/arrSize);
		
	}

}
