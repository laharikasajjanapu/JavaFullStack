package com.constructors;

public class Bike {

	String model;
	String brand;
	String color;
	double price;
	int year;
	
	//Suppose you didn't use constructor chaining.You might have to write initialization repeatedly.

	Bike() {
		this("UNKNOWN");
		System.out.println("No arg constructor called  !!! ");
	}

	Bike(String model) {
		this(model,"brand");
		System.out.println("one arg constructor called  !!! ");
		this.model = model;
	}

	Bike(String model, String brand) {
		//this();
		System.out.println("two arg constructor called  !!! ");
	}

	Bike(String model, String brand,double price) {
		this(model,brand,price,"White");
		System.out.println("three arg constructor called  !!! ");
	}

	Bike(String model, String brand,double price, String color) {
		this(model,brand,color,price,2026);
		System.out.println("four arg constructor called  !!! ");
	}

	Bike(String model, String brand, String color, double price, int year) {
		System.out.println("five arg constructor called  !!! ");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	public static void main(String[] args) {
		Bike b = new Bike();
		b.bikeInfo();
		
		Bike b2=new Bike("FZ -S","Alex");
		b2.bikeInfo();
		
		Bike b3=new Bike("FZ -S","Alex",30000);
		b3.bikeInfo();
		
		Bike b4=new Bike("FZ -S","Alex",20000,"black");
		b4.bikeInfo();
		
		Bike b5=new Bike("FZ -S","Alex","black",20000,2026);
		b5.bikeInfo();
	}

	void bikeInfo() {
		System.out.println("--------------------------------------------");
		System.out.println("Model of the bike   : " + model);
		System.out.println("brand of the bike   : " + brand);
		System.out.println("color of the bike   : " + color);
		System.out.println("price of the bike   : " + price);
		System.out.println("year of the bike   : " + year);
	}

}
