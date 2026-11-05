package com.introduction1;

public class Example {

	int a = 10;
	//instance block 
	{
		System.out.println("instance block called");
		//Example e1=new Example();  // stack overflow...
	}

	public static void main(String[] args) {
		Example e=new Example();
		System.out.println("main method started !" + e.a);
		
		
	}

	// static block -- It will be executed first before instance block
	static {
		System.out.println("static block called");
	}

}