package com.loops;

import java.util.Scanner;

// WAP to find the given number is magic or not
//sum of digits is 1 after calculating sum until single number ex:1234 ->1+2+3+4 ->10 -->1+0 -->1 (Magic)

public class CheckMagic {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean status=isMagic(n);
		if(status) {
			System.out.println("Given Number is Magic");
		}
		else {
			System.out.println("Given Number is Not Magic");
		}
		sc.close();
	}

	static boolean isMagic(int n) {
		boolean status=false;
		while(n>9) {
			int sum=0;
			while(n>0) {
				int r=n%10;
				n=n/10;
				sum=sum+r;
			}	
			n=sum;
		}
		if(n==1) {
			status=true;
		}
		
		return status;
	}

}
