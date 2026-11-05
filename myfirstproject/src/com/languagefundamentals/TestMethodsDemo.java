package com.languagefundamentals;

public class TestMethodsDemo {
	
	void addition(int a,int b) {
		System.out.println("Addition of two numbers :  " + (a + b));//44
	}
	
	void subtraction(float a,int b) {
		System.out.println("Subtraction of two numbers  : " + (a - b));//16.0
	}
	
	void multiplication(double a , int b) {
		System.out.println("Multiplication of two numbers  : " + a*b);//40.0
	}
	void remainder(int a , int b) {
		System.out.println("Remainder of two numbers  :  "+ a%b);//0
	}
	void quotient(int a, int b) {
		System.out.println("Division of two numbers  :  " + a/b);//10
	}

	public static void main(String[] args) {
		TestMethodsDemo t1=new TestMethodsDemo();
		t1.addition(22, 22);
		t1.subtraction(18, 2);
		t1.multiplication(20, 2);
		t1.remainder(20, 2);
		t1.quotient(20, 2);

	}

}
