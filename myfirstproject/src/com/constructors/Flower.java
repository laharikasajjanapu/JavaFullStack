package com.constructors;

public class Flower {
	
	String name = "Jasmine";
	String color = "White";

	public static void main(String[] args) {
		System.out.println("main method from flower");
	}

}

class Rose extends Flower{
	
	String name = "Rose";
	String color = "Red";
	
	public static void main(String[] args) {
		System.out.println("main method started from rose");
		
		Rose r=new Rose();
		r.roseInfo();
		
		//Cannot use super in a static context
		//System.out.println("Name of the flower  : " + super.name);
		
		System.out.println("main method ended from rose");
	}
	
	void roseInfo() {
		System.out.println("----------------------------");
		System.out.println("Name of the flower  : " + this.name);
		System.out.println("Color of the flower : " + this.color);
		System.out.println("----------------------------");
		System.out.println("Name of the flower  : " + super.name);
		System.out.println("Color of the flower : " + super.color);
	}
}
