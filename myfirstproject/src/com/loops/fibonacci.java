package com.loops;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		int n3=0;
		fibonacciSeries(n,n1,n2,n3);
		sc.close();

	}

	static void fibonacciSeries(int n, int n1, int n2, int n3) {
		System.out.print(n1 + " " + n2);
		for(int i=0;i<n-2;i++) {
			n3=n1+n2;
			System.out.print(" " + n3);
			n1=n2;
			n2=n3;
		}
	}

}
