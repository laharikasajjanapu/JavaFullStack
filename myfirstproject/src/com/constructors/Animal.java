package com.constructors;

public class Animal extends Object {
	
	String name;
	int age;
	

//	Animal() {
//		super();
//		System.out.println("Animal constructor called");
//	}
	
//	Animal(String name,int age){
//		this.name=name;
//		this.age=age;
//	}

	public static void main(String[] args) {
		System.out.println("main method started from Animal");

	}

}

//Implicit super constructor Animal() is undefined for default constructor. Must define an explicit constructor
class Dog extends Animal {
    // By default every constructor is calling super class constructor using super(); implicitly 
//	Dog() {
//		System.out.println("Dog constructor called");
//	}
////	
	Dog(String name,int age){
		System.out.println("Two arg constructor called");
		//super(name,age);
		System.out.println("Two arg constructor called");
	}
	
	{
		System.out.println("Instance block called ");
	}
	

	public static void main(String[] args) {
		System.out.println("main method started from Dog");

//		Dog d = new Dog();
//		d.info();
		
		Dog d1 = new Dog("laharika",10);
		d1.info();

		System.out.println("main method ended from Dog");

	}
	
	void info() {
		System.out.println(name);
		System.out.println(age);
	}
}
