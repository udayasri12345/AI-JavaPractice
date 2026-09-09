package com.basics.quest5;

public class Mobile {
	String model;
	String brand;
	String color;
	public Mobile(String model, String brand, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
	
	public void getDetails()
	{
		System.out.println("Model:"+this.model);
		System.out.println("Brand:"+this.brand);
		System.out.println("Color:"+this.color);
	}

}
