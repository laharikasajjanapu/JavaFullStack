package com.arrays;

import java.util.Scanner;

public class CheckPrime {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size : ");
		int n=sc.nextInt();
		int[] arr=new int[n];
		System.out.println("Enter Elements");
		
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(isPrime(arr[i])) {
				System.out.println(arr[i]);
			}
		}
		sc.close();
		
	}

	static boolean isPrime(int n) {
		boolean status=true;
		
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				status=false;
			}
		}
		return status;
	}

}
