package com.operators;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Total  Marks Of a Student  : ");
		double marks=sc.nextDouble();
		
		String result= (marks>=90 && marks<=100)? "S grade":(marks>=81 && marks<=90) ? "A Grade":
			(marks>=71 && marks<=80) ? "B Grade" :(marks>=51 && marks<=70) ? "C Grade" : 
			(marks>=41 && marks<=50) ? "D Grade" :(marks>=35 && marks<=40) ? "E Grade" :
			(marks>=0 && marks<=34) ? "Failed" : "Invalid Marks";
		
		
		System.out.println("Final result is :  "  + result);
		//datatype variable = (condition) ? statement1: statement2
		sc.close();
	
	}

}
