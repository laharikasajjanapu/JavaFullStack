package com.constructors;

public class Student {
	
	int sid;
	String sname;
	
	Student(){
		System.out.println(sid);
		System.out.println(sname);
		System.out.println("---------------------");
	}
	
	Student(int sid,String sname){
		this.sid=sid;
		this.sname=sname;
	}
	
	public static void main(String[] args) {
		Student s1=new Student();
		s1.sid=101;
		s1.sname="Vennela";
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		Student s2=new Student(102,"Laharika");
		System.out.println("---------------------");
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);

	}

}
