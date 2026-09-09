package com.oops.basics;

public class Armstrong {

	public boolean findArmstrong(int number) {
		int sum = 0;
		int num = number;
		int power = String.valueOf(num).length();
		while (num > 0) {
			int digit = num % 10;
			sum += Math.pow(digit, power);
			num = num / 10;
		}

		if (sum == number)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Armstrong armstrong = new Armstrong();
		int number = 153;
		if (armstrong.findArmstrong(number)) {
			System.out.println(number + " is an Armstrong number");
		} else
			System.out.println(number + " is not an Armstrong number");
	}

}
