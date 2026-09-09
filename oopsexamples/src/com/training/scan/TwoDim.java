package com.training.scan;

import java.util.Scanner;

public class TwoDim {

	public static void main(String[] args) {
		String[][] names = new String[2][2];
		String[] Snames = new String[4];
		Scanner sc = new Scanner(System.in);
		int index = 0;
		System.out.println("Enter the list of names :");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				names[i][j] = sc.next();
				char initial=names[i][j].charAt(0);
				if (initial=='s') {
					Snames[index] = names[i][j];
					index++;
				}
			}
		}
		for (String i : Snames)
		{
			if(i!=null)
			System.out.println(i);
		}
			
	}

}
