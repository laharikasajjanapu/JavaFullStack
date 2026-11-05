package com.oops;

public class Vehicle {
	
	String name;
	String speed;
	
	public Vehicle(String name, String speed) {
		super();
		this.name = name;
		this.speed = speed;
	}

	void start() {
		System.out.println("Started");
	}
	
	void stop() {
		System.out.println("Stopped");
		System.out.println("---------------------------");
	}
	
	void display() {
		System.out.println("Vehicle Name : " + name);
		System.out.println("Speed        : " + speed);
	}

	public static void main(String[] args) {
		
		Car c1=new Car("Car","50km/hr");
		c1.display();
		c1.start();
		c1.sunRoof();
		c1.stop();

		
		Bike b1=new Bike("Bike","60km/hr");
		b1.display();
		b1.start();
		b1.doWheelie();
		b1.stop();
		
		
		Truck t1=new Truck("Truck","70km/hr");
		t1.display();
		t1.start();
		t1.loadCargo();
		t1.stop();
		
	}

}

class Car extends Vehicle{
	public Car(String name, String speed) {
		super(name,speed);
	}

	void sunRoof() {
		System.out.println("Opening sun roof");
	}
	
}

class Bike extends Vehicle{
	
	public Bike(String name, String speed) {
		super(name,speed);
	}

	void doWheelie() {
		System.out.println("Doing wheelie");
	}
	
}
class Truck extends Vehicle{
	
	public Truck(String name, String speed) {
		super(name,speed);
	}

	void loadCargo() {
		System.out.println("Loading Cargo");
	}
}
