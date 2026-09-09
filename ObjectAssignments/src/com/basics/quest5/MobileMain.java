package com.basics.quest5;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("A6", "HTC", "Blue");
		Mobile mobile2 = new Mobile("Iphone", "Apple", "Orange");
		Mobile mobile3 = new Mobile("X3", "Samsung", "White");
		Mobile mobile4 = new Mobile("Android", "Imobile", "Red");
		Mobile mobile5 = new Mobile("I4", "Motorola", "Cream");

		Mobile[] mobilesArray = new Mobile[] { mobile1, mobile2, mobile3, mobile4, mobile5 };
		System.out.println("********************************");
		System.out.println("List of mobiles and its details:");
		for (Mobile mobilearray : mobilesArray) {
			mobilearray.getDetails();
			System.out.println("_________________________________");
		}
		System.out.println("********************************");
		System.out.println("********************************");
		System.out.println("List of Samsung mobiles and its details:");
		for (Mobile mobilearray : mobilesArray) {
			if (mobilearray.brand.equals("Samsung"))
				mobilearray.getDetails();
		}
		System.out.println("********************************");

	}
}
