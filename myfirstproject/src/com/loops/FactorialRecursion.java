package com.loops;

import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		long factorial=factorial(n);
		System.out.println(factorial);
		sc.close();
	}

	static long factorial(int n) {
		
		if(n==0 || n==1) {
			return 1;
		}
		return n*factorial(n-1);
	}

}
