package com.loops;

// WAP to check the given number is Strong or not --- 145 is strong
import java.util.Scanner;

public class CheckStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check strong or not");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		for(;n>0;n=n/10) {
			int r=n%10;
			sum+=sumOfFactorial(r);
		}
		
		if(temp==sum) {
			System.out.println("Given number is Strong");
		}
		else {
			System.out.println("Not Strong");
		}
		sc.close();
		
	}

	static int sumOfFactorial(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
}
