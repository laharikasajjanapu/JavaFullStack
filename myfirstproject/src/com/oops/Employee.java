package com.oops;

//DTO : Data Transfer Object
//POJO : Plain Old Java Object

public class Employee {
	
	int eId;
	String eName;
	double sal;
	
	private int employeeId;
	private String employeeName;
	private double salary;
	
	
	public Employee(int eId,String eName,double sal) {
		this.eId=eId;
		this.eName=eName;
		this.sal=sal;
	}
	
	public void setEid(int employeeId) {
		this.employeeId=employeeId;
	}
	
	public int getId() {
		return employeeId;
	}
	
	public void setEname(String employeeName) {
		this.employeeName=employeeName;
	}
	
	public String getName() {
		return employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary=salary;
	}
	
	public double getSalary() {
		return salary;
	}
	
	
	
}
