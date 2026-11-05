package com.loops;

import java.util.Scanner;

public class IsArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		int n=sc.nextInt();
		boolean status=isArmstrong(n);
		if(status) {
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is Not Armstrong");
		}
		sc.close();
	}

	static boolean isArmstrong(int n) {
		boolean status=false;
//		String str=Integer.toString(n);
//		int digitsCount=Integer.toString(n).length();
		int r=0;
		int sum=0;
		int temp=n;
		int n1=n;
		int digitsCount=0;
		while(n1>0) {
			n1=n1/10;
			digitsCount++;
		}
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=(int)(sum+ Math.pow(r,digitsCount));
		}
		if(temp==sum) {
			status=true;
		}
		return status;
	}
	
	

}
