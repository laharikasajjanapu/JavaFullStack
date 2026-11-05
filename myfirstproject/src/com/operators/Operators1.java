package com.operators;

public class Operators1 {

	public static void main(String[] args) {
		int a=20;
		
		// SHIFT OPEATORS
		System.out.println(a<<2);
		System.out.println(a>>2);
		System.out.println(a>>>2);
		
		//TERNARY OPERATOR
		String result=(a>18) ? "Eligible" :"Not Eligible";
		System.out.println(result);
		
		// INSTANCEOF OPERATOR
		String name="Java";
		System.out.println(name instanceof String);
		Object obj=123;
//		System.out.println(obj instanceof int);//Incompatible conditional operand types Object and int
//		instanceof works with reference type,not primitive values
		System.out.println(obj instanceof Integer);// True
		Object obj1=123.45;
		System.out.println(obj1 instanceof Float);//False--> because floating point default is double
		
		//Integer parent class is number and number parent class is object
		Integer i=100;
		System.out.println(i instanceof Integer);//true
		System.out.println(i instanceof Number);//true
		System.out.println(i instanceof Object);//true
		
		
	}

}
