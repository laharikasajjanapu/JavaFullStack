package com.logicalstatements;

import java.util.Scanner;

public class TestDemoLs1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Jersey number");
		int Jno=sc.nextInt();
		switch(Jno) {
		case 18:
			System.out.println("Virat Kohili");
			System.out.println("Aggressive Batsman");
			break;
		case 45:
			System.out.println("Rohit Sharma");
			System.out.println("Powerful Opener");
			break;
		case 33:
			System.out.println("Hardhik Pandya");
			System.out.println("Dynamic All-Rounder");
			break;
		case 1:
			System.out.println("KL Rahul");
			System.out.println("Aggressive");
			break;
		case 93:
			System.out.println("Jasprit Bumrah");
			System.out.println("World-class fast");
			break;
		case 77:
			System.out.println("Shubhman Gill");
			System.out.println("Elegant Batsman");
			break;
		case 63:
			System.out.println("Suryakumar Yadav");
			System.out.println("Explosive Batsman");
			break;
		default:
			System.out.println("ENter valid jersey number");

		}
		
		sc.close();
	}
	
	void display() {
		
	}
	
	
}

class child extends TestDemoLs1{
	void display() {
		
	}
}






