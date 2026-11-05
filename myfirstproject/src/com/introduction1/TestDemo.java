package com.introduction1;

public class TestDemo {
	
	static int a=20;
	boolean boo=true;
	boolean b1=false;
	static char c1='@';

	
	static {
		System.out.println("static block1");
	}
	

	static {
		System.out.println("static block2");
	}
	

	public static void main(String[] args) {
		var a=9223372036854775807L;
		
		//To check the type of data 
		
		System.out.println(((Object)a).getClass().getSimpleName());
		System.out.println((int)c1); //61 using explicit type casting

	}
	
	static {
		System.out.println("static block3");
	}


}
