package com.loops;

import java.util.Scanner;

public class TestLoops {
	
	String week(int n) {
	String week=switch(n) {
	case 1->{
	System.out.println("Sunday");
	yield "SUNDAY";
	}
	case 2->{
	System.out.println("MONDAY");
	yield "SUNDAY";
	}
	case 3->{
	System.out.println("TUESDAY");
	yield "SUNDAY";
	}
	case 4->{
	System.out.println("WEDNESDAY");
	yield "SUNDAY";
	}
	default->"INVALID";
	};
	return week;
	}

	void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("main method started !!");
		int n=sc.nextInt();
		String week=week(n);
		
		System.out.println("Week inforation  : " + week);
		sc.close();
	
		
	}

}
