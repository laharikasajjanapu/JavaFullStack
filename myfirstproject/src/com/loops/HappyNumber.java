package com.loops;

import java.util.Scanner;

// Happy Number -->16-> 1^2 + 6^2= 1+36 = 37 -->9+49-->58
public class HappyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		happyNumber(n);
		sc.close();
	}

	static void happyNumber(int n) {
		int temp=n;
		while(temp!=1 && temp!=4) {
			int r=0;
			int sum=0;
			while(temp>0) {
				r=temp%10;
				temp=temp/10;
				sum=sum+(r*r);
			}
			
			temp=sum;
		}
		
		if(temp==1) {
			System.out.println(n + " is a Happy Number");
		}
		else {
			System.out.println(n + " is not a Happy Number");
		}
	}
	
	

}
