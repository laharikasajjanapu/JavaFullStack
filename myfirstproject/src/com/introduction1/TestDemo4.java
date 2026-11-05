package com.introduction1;

public class TestDemo4 {

	//static TestDemo4 t4 = new TestDemo4();
	
	native void welcome();
	
	void hello() {
		System.out.println(Thread.currentThread());
		
		// Thread[#3,main,5,main] -> It represents currently executing thread ID,Name,Priority, Group
		int a = 10;
		int b = 20;

		System.out.println(a + b);

		System.out.println("Hello");
		System.out.println("Hello");
		System.out.println("Hello");
	}

	// static Block


	public static void main(String[] args) {
		System.out.println("main method started ");
		
		TestDemo4 t4 = new TestDemo4();
		//t4.welcome(); -> java.lang.UnsatisfiedLinkError  
		//could not find the required native implementation/library
		t4.hello();

		System.out.println("main method ended ");
	}

}