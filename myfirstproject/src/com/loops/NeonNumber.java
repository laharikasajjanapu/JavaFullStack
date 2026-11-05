package com.loops;

import java.util.Scanner;

//n=9 then 9^2 =81 -> 9
public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		boolean status=isNeonNumber(n);
		if(status) {
			System.out.println("Neon Number");
		}
		else {
			System.out.println("Not a Neon Number");
		}
		sc.close();
	}

	static boolean isNeonNumber(int n) {
		boolean status=false;
		int r=0;
		int sum=0;
		int temp=n;
		int n1=(int)Math.pow(n, 2);
		while(n1>0) {
			r=n1%10;
			n1=n1/10;
			sum=sum+r;
		}
		if(temp==sum) {
			status=true;
		}	
		return status;
	}
	

}
