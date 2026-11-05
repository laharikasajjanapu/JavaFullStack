package com.javamethods;

public class Examples {

	int addition;
	int difference;
	int multiplication;
	float division;

	public static void main(String[] args) {
		Examples e=new Examples();
		e.addition(20, 30);
		e.subtraction(e.addition, 30);
		e.multiplication(e.difference, 20);
		e.division(e.multiplication, 6);
	}

	void addition(int a, int b) {
		addition = a + b;
		System.out.println("Addition is " + addition);
	}

	void subtraction(int result, int c) {
		result = addition;
		difference = result - c;
		System.out.println("Difference  is : " + difference);
	}

	void multiplication(int result, int d) {
		result = difference;
		multiplication = difference * d;
		System.out.println("Multiplication is   : " + multiplication);
	}
	
	void division(int result, int e) {
		result = multiplication;
		division = result / e;
		System.out.println("Quotient is  : " + division);
	}
	
}
