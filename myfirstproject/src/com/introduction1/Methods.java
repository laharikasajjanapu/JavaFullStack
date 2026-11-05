package com.introduction1;

public class Methods {
	
	int studentNo;
	
	static void display() {
		System.out.println("Display Method");
	}
	void show() {
		
		int age=21;;
		System.out.println("Show Method");
		System.out.println(age);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method started");
		display();
		Methods s1=new Methods();
		s1.show();
		System.out.println("Main Method Ended");
		
		// Not recommended accessing the static data by using object reference variable
		//s1.display();
		Methods.display();
		
		s1.studentNo=102;
		System.out.println("StudentNumber   :  " + s1.studentNo);
		
		System.out.println("Name: Sajjanapu Laharika\nCourse: Java full stack\nBatch : 76");
		
		
	}	

}
