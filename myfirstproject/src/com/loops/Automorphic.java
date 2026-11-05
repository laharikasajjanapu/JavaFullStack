package com.loops;

import java.util.Scanner;

//5 ->5*5 = 25 then last digit is equal to given number
public class Automorphic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int square=n*n;
		int mod=1;
		int temp=n;
		while(temp>0) {
			temp=temp/10;
			mod=mod*10;
		}
		
		int result=square%mod;
		System.out.println("Square: " + square);
		System.out.println(result);
		if(n==result) {
			System.out.println("Given number is Automorphic");
		}
		else {
			System.out.println("Given number is not Automorphic");
		}
		sc.close();

	}

}
