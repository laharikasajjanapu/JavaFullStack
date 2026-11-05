package com.loops;

import java.util.Scanner;

public class NthFibonacci {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number ");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		int number1=nthFibonacci(n,n1,n2,n3);
		System.out.println( number1);
		int number2=nthFibonacci(n,n1,n2,n3);
		System.out.println( number2);
		sc.close();
	}

	static int nthFibonacci(int n, int n1, int n2, int n3) {
		
		int count=1;
		if(n==1) {
			return 1;
		}
		while(n>1) {
			n3=n1+n2;
			count++;
			if(count==n) {
				return n3;
			}
			n1=n2;
			n2=n3;
		}
		
		return 0;
	}
	static int nthFibonacciNumber(int n,int n1, int n2, int n3) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		for(int i=0;i<=n;i++) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
		}
		return n3;
	}
	

}
