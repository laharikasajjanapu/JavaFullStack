package com.loops;

import java.util.Scanner;

//n= 3--> 2,3,5
public class TestDemoLoop4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int count=0;
		
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) {
				System.out.println(i);
				count++;
				if(count==n) {
					break;
				}
			}
			
		}
		sc.close();

	}

	static boolean isPrime(int n) {
		boolean status=true;
		if(n==0 || n==1) {
			status=false;
		}
		if(n==2) {
			status=true;
		}
		if(n%2==0) {
			status=false;
		}
		return status;
	}

}
