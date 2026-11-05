package com.loops;

import java.util.Scanner;

public class FindNthCharacter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int n=sc.nextInt();
		findCharacter(n);
		sc.close();

	}
	
	static void findCharacter(int n) {
		int count=0;
		for(char ch='A';ch<='Z';ch++) {
			count=count+1;
			if(count==n) {
				System.out.println(ch);
			}
		}
	}

}
