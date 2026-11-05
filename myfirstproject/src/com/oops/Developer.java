package com.oops;

public class Developer extends Employee{
	
	public Developer(int eId, String eName, double sal) {
		super(eId, eName, sal);
	}

	String programmingLanguage;
	
	void display() {
		System.out.println(eId);
		System.out.println(eName);
		System.out.println(sal);
		System.out.println(programmingLanguage);
	}

	public static void main(String[] args) {
		
		Developer d=new Developer(4,"Rasagna",50000);
		System.out.println(d.eId);
		System.out.println(d.eName);
		System.out.println(d.sal);
		d.eId=1;
		d.eName="Vennela";
		d.sal=100000;
		d.programmingLanguage="Java";
		d.display();
	}

}
