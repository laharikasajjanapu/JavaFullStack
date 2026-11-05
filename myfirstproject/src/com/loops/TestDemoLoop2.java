package com.loops;

// WAP to print math table upto given range
import java.util.Scanner;

public class TestDemoLoop2 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++) {
			multiplication(i);	
		}
		sc.close();
	}

	static void multiplication(int n) {
		
		for(int j=1;j<=10;j++) {
			System.out.println(n + " x " + j + " = " + (n * j));
		}
		System.out.println("-------------------------------------");
		
	}

}

      