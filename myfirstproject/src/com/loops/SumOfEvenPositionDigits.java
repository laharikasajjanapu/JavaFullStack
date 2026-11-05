package com.loops;

import java.util.Scanner;
// WAP to print the sum of digits in the even position of given number
public class SumOfEvenPositionDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=sumOfDigits(n);
		System.out.println(sum);
		sc.close();
	}

	static int sumOfDigits(int n) {
		int r=0;
		int sum=0;
		int count=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			count++;
			if(count%2==0) {
				sum=sum+r;
			}
		}
		return sum;
	}

}
