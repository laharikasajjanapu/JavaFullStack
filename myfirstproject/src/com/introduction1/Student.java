package com.introduction1;

public class Student {
	
	static String collegeName="KCEA";
	int studentId;
	String studentName;
	int englishMarks;
	int teluguMarks;
	int hindiMarks;
	int totalMarks;
	int percentage;
	
	void calculateTotal() {
		totalMarks=teluguMarks+hindiMarks+englishMarks;
	}
	
	void calculatePercentage() {
		percentage=totalMarks/3;
	}
	
	void displayStudent() {
		System.out.println("College Name  :  "+ collegeName);
		System.out.println("Student Id : " + studentId );
		System.out.println("Student Name  : "+ studentName);
		System.out.println("Percentage  :  "+ percentage);
	}

	public static void main(String[] args) {
		
		Student s1=new Student();
		Student s2=new Student();
		
		s1.studentId=101;
		s1.studentName="Laharika";
		s1.englishMarks=80;
		s1.teluguMarks=80;
		s1.hindiMarks=90;
		
		s2.studentId=102;
		s2.studentName="Vennela";
		s2.englishMarks=85;
		s2.teluguMarks=84;
		s2.hindiMarks=92;
		
		s1.calculateTotal();
		s1.calculatePercentage();
		s1.displayStudent();
		
		s2.calculateTotal();
		s2.calculatePercentage();
		s2.displayStudent();

	}

}
