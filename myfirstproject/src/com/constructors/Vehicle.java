package com.constructors;

public class Vehicle {
	String type;
	Vehicle(String type){
		this.type=type;
	}

}

class Scooter extends Vehicle {
	String brand;
	double price;
	Scooter(String type,String brand,double price){
		super(type);
		this.brand=brand;
		this.price=price;
	}
	
}

class ElectricCar extends Scooter{
	String batteryCapacity;
	ElectricCar(String type,String brand,double price, String batteryCapacity ){
		super(type,brand,price);
		this.batteryCapacity=batteryCapacity;
	}
	
	void display() {
		System.out.println(" Type of vehicle   " + type);
		System.out.println("Brand of Vehicle   " + brand);
		System.out.println("Price of vehicle   " + price);
		System.out.println("Battery Capacity   " + batteryCapacity);
	}
	
	public static void main(String[] args) {
		ElectricCar ec=new ElectricCar("Electric","Tesla",2340000,"120 KWh");
		ec.display();
	}
	
	
}
