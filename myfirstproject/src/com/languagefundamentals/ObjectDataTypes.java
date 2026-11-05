package com.languagefundamentals;

public class ObjectDataTypes {
	
	Integer studentId;
	String studentName;
	Character gender;
	String branchName;
	String collegeName;
	
	void display() {
		System.out.println("Student Id     : "+ studentId);
		System.out.println("Student Name   : "+ studentName);
		System.out.println("Student Gender : "+ gender);
		System.out.println("Branch Name    : "+ branchName);
		System.out.println("College Name   : "+ collegeName);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectDataTypes o1=new ObjectDataTypes();
		o1.studentId=100;
		o1.studentName="Laharika";
		o1.gender='F';
		o1.branchName="CSE";
		o1.collegeName="KCEA";
		o1.display();

	}

}
