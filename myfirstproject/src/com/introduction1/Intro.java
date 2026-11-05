package com.introduction1;

public class Intro extends Object{
	
	char c2='C';
	
	void value() {
		System.out.println("Hello");
		return;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("Hello java");
		Intro in=new Intro(); 
		in.value();
		char ch='A';
		System.out.println(ch + 1); //66
		System.out.println(in.c2); //C
		// Class loader sub system
		// 1. loading java core classes
		// 2. loads platform libraries
		// 3. loads user defined classes from classpath
		System.out.println(Class.forName("com.introduction1.MyDetails"));//class com.introduction1.MyDetails
		System.out.println(Class.forName("java.lang.System"));//class java.lang.System
		System.out.println(Class.forName("com.mysql.cj.jdbc.Driver"));//class com.mysql.cj.jdbc.Driver

	}

}
