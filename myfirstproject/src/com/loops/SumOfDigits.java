package com.loops;

import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		for(;n>0;n=n/10) {
			int r=n%10;
			sum=sum+r;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
