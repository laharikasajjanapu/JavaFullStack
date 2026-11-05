package com.loops;

import java.util.Scanner;
// Find the maximum factor of given number excluding given number
public class MaximumFactor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number ");
		int n=sc.nextInt();
		int max=1;
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) { 
				max=i;
			}	
		}
		System.out.println(max);
		sc.close();
	}

}
