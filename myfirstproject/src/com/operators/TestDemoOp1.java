package com.operators;

import java.util.Scanner;

public class TestDemoOp1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		
		System.out.println("Enter b value");
		int b=sc.nextInt();
		
		System.out.println("Before Swapping : ");
		System.out.println("A value  : "+a);
		System.out.println("B value  : "+b);
		
//		int temp=a;
//		a=b;
//		b=temp;
//		
//		System.out.println("After Swapping : ");
//		System.out.println("A value : "+a);
//		System.out.println("B value : "+b);		
//		
//		temp=a+b;
//		a=temp-a;
//		b=temp-b;
		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		

		a= a^b;
		b= b^a;
		a= a^b;
		System.out.println("------------");
		System.out.println("A value : "+a);
		System.out.println("B value : "+b);	
		
		sc.close();
		
	}
	
	// Bitwise --> & ! ~ ^

}
