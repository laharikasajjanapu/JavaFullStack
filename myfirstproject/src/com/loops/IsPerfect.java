package com.loops;

import java.util.Scanner;
//check whether the given number is perfect or not

public class IsPerfect {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number");
		int n=sc.nextInt();
		boolean status=isPerfect(n);
		if(status) {
			System.out.println("Perfect Number");
		}
		else {
			System.out.println("Not a Perfect Number");
		}
		sc.close();
	}
	
	
	static boolean isPerfect(int n) {
		boolean status=false;
		int sum=0;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {
				sum=sum+i;
			}
			if(sum==n) {
				status=true;
			}
		}
		return status;
		
	}
}
