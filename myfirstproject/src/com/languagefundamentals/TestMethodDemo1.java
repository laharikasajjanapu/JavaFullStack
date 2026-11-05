package com.languagefundamentals;
import java.util.Scanner;

public class TestMethodDemo1 {
	
	// No return type and contains parameters

	public static void main(String[] args) {
		
		TestMethodDemo1 t1=new TestMethodDemo1();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the student ID  :  ");
		int id=sc.nextInt();
		System.out.println("Enter the Student Name : ");
		sc.next();
		String ename=sc.nextLine();
		System.out.println("Enter the Student Age  : ");
		int age=sc.nextInt();
		get_Student_Details(id,ename);
		sc.close();
		t1.get_Student_Age(age);
		
	}
	
	static void get_Student_Details(int sid,String sname) {
		System.out.println("Student Name  :  "+ sname);
		System.out.println("Student ID    :  " +sid);
	}
	
	void get_Student_Age(int sage) {
		System.out.println("Student Age   :  "+ sage);
	}

}
