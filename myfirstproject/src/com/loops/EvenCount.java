package com.loops;

import java.util.Scanner;

public class EvenCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=sc.nextInt();
		int count=evenCount(n);
		System.out.println("Even Count is :  " +count);
		
		sc.close();

	}
	
	static int evenCount(int n) {
		int count=0;
		for(;n>0;) {
			n=n/10;
			int r=n%10;
			if(r%2==0) {
				count++;
			}
		}
		return count;
	}

}
