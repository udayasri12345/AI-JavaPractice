package com.oops.basics;

public class Product {
	String[] showProducts() {
		// String[] products = new String[] { "Laptop", "Mouse", "Mobile", "Pen" };
		// return products;

		return new String[] { "Laptop", "Mouse", "Mobile", "Pen" };
	}

	void printCategories(String[] categories) {
		for(String category:categories)
		{
			System.out.println(category);
		}
	}

	String offerDetails() {
		return "Onam offers available";
	}

	public static void main(String[] args) {
		Product product = new Product();
		String offers=product.offerDetails();
		System.out.println(offers);
		String[] allProducts=product.showProducts();
		for(String prod:allProducts)
		{
			System.out.println(prod);
		}
		
		String[] categories=new String[] {"Electronics","Books","Toys"};
		product.printCategories(categories);
	}
}
