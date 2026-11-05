package com.javamethods;
import java.util.Scanner;

public class Example {
	static Scanner sc=new Scanner(System.in);
	
	String name;
	int age;
	double marks;

	static Example getStudent() {
		Example e=new Example();
		System.out.println("Enter Name  : ");
		e.name=sc.nextLine();
		System.out.println("Enter Age   : ");
		e.age=sc.nextInt();
		System.out.println("Enter Marks :");
		e.marks=sc.nextInt();
		return e;
	}
	public static void main(String[] args) {
		Example result=getStudent();
		System.out.println("Name  :  "  + result.name);
		System.out.println("Age   :  "  + result.age);
		System.out.println("Marks :  "  + result.marks);

	}
	
}
