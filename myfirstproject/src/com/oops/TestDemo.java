package com.oops;

//UpCasting : Creating Child Object with Parent Reference

class User{
	
	String userName;
	String password;
	
	User(String userName,String password){
		this.userName=userName;
		this.password=password;
	}

	void submitAssignment() {
		
	}

	void createCourse() {
		
	}
}

class Students extends User{
	
	
	Students(String userName,String password){
		super(userName,password);
	}
	
	void submitAssignment(){
		System.out.println("Submitted the Assignment");
	}
	
}

class Instructors extends User{
	
	Instructors(String userName, String password) {
		super(userName, password);
	}

	void createCourse() {
		System.out.println("Creates the course");
	}
}

public class TestDemo{
	
	public static void main(String[] args) {
		User s1=new Students("Laharika","07892");
		User i1=new Instructors("Vennela","028851");
		System.out.println(s1.userName);
		System.out.println(s1.password);
		s1.submitAssignment();
		System.out.println("--------------------------------");
		
		System.out.println(i1.userName);
		System.out.println(i1.password);
		i1.createCourse();
	}
}

