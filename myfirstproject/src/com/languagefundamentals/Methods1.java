package com.languagefundamentals;
import java.util.Scanner;

public class Methods1 {
	
	static Scanner sc=new Scanner(System.in);
	
	double method1(int a,int b) {
		System.out.println("Entre a value      : ");
		a=sc.nextInt();
		System.out.println("Entre a value      : ");
		a=sc.nextInt();
		double difference= method2(20,10);
		System.out.println("Difference is      :  " + difference);
		return a+b;
	}
	
	double method2(int c,int d) {
		double mult=method3(20,3);
		System.out.println("Multiplication is  : " + mult);
		return c-d;
	}
	
	static double method3(int d,int e) {
		double division= method4(40,20);
		System.out.println("Division is        :  " + division);
		return d*e;
	}
	
	static double method4(int e,int f) {
		return e/f;
	}

	public static void main(String[] args) {
		Methods1 m1=new Methods1();
		double add=m1.method1(20, 20);
		System.out.println("Addition is      : " + add);

	}

}
