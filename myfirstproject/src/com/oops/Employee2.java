package com.oops;

import java.util.Scanner;

public class Employee2 {
	
	static Scanner sc=new Scanner(System.in);
	String name;
	Integer id;
	double salary;
	
	Employee2(String name,Integer id,double salary){
		this.name=name;
		this.id=id;
		this.salary=salary;
	}
	
	double calculateSalary(){
		return 0;
	}
	
	void display() {
		System.out.println("Employee Name   " + name);
		System.out.println("Employee ID     " + id);
		System.out.println("Employee Salary " + calculateSalary());
	} 
	public static void main(String[] args) {
		Employee2 e1=new PermanentEmployee("Vennela",101,40000);
		Employee2 e2=new ContractEmployee("Laharika",102,50000);
		e1.display();
		System.out.println("-------------------------------");
		e2.display();
	}

}

class PermanentEmployee extends Employee2{
	
	double calculateSalary() {
		return salary+5000;
	}
	
	PermanentEmployee(String name,Integer id,double salary){
		super(name,id,salary);
	}
}

class ContractEmployee extends Employee2{
	ContractEmployee(String name,Integer id,double salary){
		super(name,id,salary);
	}
	double calculateSalary() {
		System.out.println("Enter the number Of Hours ");
		int hours=sc.nextInt();
		int rate=hours*1000;
		return salary+rate;
	}
}
