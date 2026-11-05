package com.constructors;

public class Car {

	String model;
	String brand;
	String color;
	double price;
	int year;

	Car(String model, String brand, String color, double price, int year) {
		System.out.println("5-parameterized constructor called");
		this("model","Alex","green");
		this.model = model;
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.year = year;
	}

	Car(String model, String brand, String color) {
		System.out.println("3-parameterized constructor called");
		this.model = model;
		this.brand = brand;
		this.color = color;
	}

	Car() {
		System.out.println("no-arg constructor called !");
	}

	public static void main(String[] args) {
		System.out.println("main method started ");

		Car c = new Car("Sonet", "KIA", "RED");
		c.carInfo();
		
		Car c3 = new Car("Sonet", "  ", "RED");
		c3.carInfo();
		

		Car c1 = new Car();
		c1.brand = "Audi";
		c1.carInfo();

		Car c2 = new Car("Seltos", "KIA", "White", 1800000.00, 2026);
		c2.carInfo();

	}

	void carInfo() {
		System.out.println("--------------------------------");
		System.out.println("Model of the Car : " + model);
		System.out.println("Brand of the Car : " + brand);
		System.out.println("Color of the Car : " + color);
		System.out.println("Price of the Car : " + price);
		System.out.println("Year of the Car : " + year);
	}

}


