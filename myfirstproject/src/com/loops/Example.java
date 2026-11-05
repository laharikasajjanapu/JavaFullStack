package com.loops;

import java.util.Scanner;
// 4--->7 
public class Example {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			if(isPrime(n)) {
				System.out.println(i);
			}
		}
		sc.close();
	}

	private static boolean isPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			return false;
		}
		for(int i=2;i<=100;i++) {
			if(n%i==0) {
				status=false;
				return status;
			}
		}
		return status;
	}

}
