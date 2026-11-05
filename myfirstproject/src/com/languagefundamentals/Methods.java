package com.languagefundamentals;
import java.util.Scanner;

public class Methods {
	// int result;
	int difference;
	int product;
	
	//No return type + parameters
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a value  : ");
		int a=sc.nextInt();
		System.out.println("Enter a value  : ");
		int b=sc.nextInt();
		Methods m1=new Methods();
		m1.addition(a, b);
		//m1.subtraction(m1.result, 10);
		m1.multiplication(m1.difference, 2);
		//m1.division(m1.product, 3);
		sc.close();

	}
	
	void addition(int a,int b) {
		int result= a+b;
		System.out.println("Addition is " + result);
		subtraction(result,20);
		
	} 
	
	void subtraction(int sum,int c) {
		difference= sum - c;
		System.out.println("Subtraction  is "+ difference);
	}
	
	void multiplication(int product,int d) {
		product= difference * d;
		System.out.println("Multiplication is " + product);
		division(product, 7);
	}
	
	void division(float quotient,int e) {
		quotient=quotient / e;
		System.out.println("Division  is :" + quotient);
	}
	
}
