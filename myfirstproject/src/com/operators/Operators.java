package com.operators;

public class Operators {

	public static void main(String[] args) {
		int a=1;
		int result=0;
		//result=result+4.5;
		result=(int)(result+4.5);
		result+=4.5;
		System.out.println(result);
		
		double result2=0;
		result2=result2+4;
		System.out.println(a++ + ++a + a++ + ++a);
		
		System.out.println(a++);
		System.out.println(++a);
		
		// Implicit type casting
		char ch='A';
		int a1=ch;
		System.out.println(a1);
		
		long l1=0;
		System.out.println(l1);

		
		double d=10.0;
		float e=(float)d;
		
		System.out.println(e);
		
		int j=6;
		System.out.println(-j);
		
		System.out.println((-20)>>>2);
		
		
//		System.out.println();
//		System.out.println(a1);

	}

}
