package com.operators;

import java.util.Scanner;

public class TestDemoOp2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the input value : ");
		Integer input=sc.nextInt();
		
		if(input%3==0 && input%5==0) {
			System.out.println("Fizz Buzz");
		}
		else if(input%3==0) {
			System.out.println("Fizz");
		}
		else if(input%5==0) {
			System.out.println("Buzz");
		}
		
		else {
			System.out.println("Not divisible by 3 or 5");
		}
		
		sc.close();

	}

}
