package com.loops;

import java.util.Scanner;

// 1000 --> 8 
public class BinaryToDecimal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();
		int sum=0;
		int count=0;
		while(n>0) {
			int x=n%10;
			if(x==0) {
				sum=sum+0;
				count++;
			}
			else if(x==1) {
				sum+=Math.pow(2, count);
				count++;
			}
			n=n/10;
		}
		System.out.println(sum);
		
		sc.close();
		
	}

}
