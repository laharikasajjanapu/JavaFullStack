package com.constructors;

public class Employee {
	
	int eId;
	String name;
	String department;
	int salary;
	
	Employee(){
		System.out.println(eId);
		System.out.println(name);
		System.out.println(department);
		System.out.println(salary);
		System.out.println("---------------------");
	}
	
	Employee(int eId,String name,String department,int salary){
		this.eId=eId;
		this.name=name;
		this.department=department;
		this.salary=salary;
	}

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.eId=101;
		e1.name="Laharika";
		e1.department="CSE";
		e1.salary=1000;
		System.out.println(e1.eId);
		System.out.println(e1.name);
		System.out.println(e1.department);
		System.out.println(e1.salary);
		System.out.println("---------------------");
		
		Employee e2=new Employee(102,"Vennela","ECE",2000);
		System.out.println(e2.eId);
		System.out.println(e2.name);
		System.out.println(e2.department);
		System.out.println(e2.salary);
		

	}

}
