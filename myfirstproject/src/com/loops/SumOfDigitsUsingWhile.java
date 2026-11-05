package com.loops;

import java.util.Scanner;

public class SumOfDigitsUsingWhile {

	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		digitCountAndSum(n);
		sc.close();
	}

	void digitCountAndSum(int n) {
		int sum=0;
		int r=0;
		int count=0;
		int product=1;
		while (n>0) {
			r=n%10;
			System.out.println(r);
			n=n/10;
			sum=sum+r;
			product=product*r;
			count++;
		}
		System.out.println(sum);
		System.out.println(count);	
		System.out.println(product);
	}
}
