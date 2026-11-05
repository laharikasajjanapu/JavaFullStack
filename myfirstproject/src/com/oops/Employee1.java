package com.oops;

public class Employee1 {
	
	int empno;
	String ename;
	double sal;
	String designation;
	String companyname;
	
	public void setEmpNo(int empno) {
		this.empno=empno;
	}
	
	public int getEmpNo() {
		return empno;
	}
	
	public void setEname(String ename) {
		this.ename=ename;
	}
	
	public String getEname() {
		return ename;
	}
	
	public void setSal(double sal) {
		this.sal=sal;
	}
	
	public double getSal() {
		return sal;
	}
	public void setDesignation(String designation) {
		this.designation=designation;
	}
	public String getDesignation() {
		return designation;
	}
	public void setCompanyName(String companyname) {
		this.companyname=companyname;
	}
	public String getCompanyName() {
		return companyname;
	}
	
	void modifySalary() {
		setSal(40000);
	}

	public static void main(String[] args) {
		
		Employee1 e1=new Employee1();
		e1.setEmpNo(1);
		e1.setEname("Rasagna");
		e1.setCompanyName("Wipro");
		e1.setDesignation("Java Developer");
		e1.setSal(30000);
		
		System.out.println("Employee Number : " + e1.getEmpNo());
		System.out.println("Employee Name   : " + e1.getEname());
		System.out.println("Salary          : " + e1.getSal());
		System.out.println("Company Name    : " + e1.getCompanyName());
		System.out.println("Designation     : " + e1.getDesignation());
		
		e1.modifySalary();
		System.out.println("Updated Salary  : " + e1.getSal());
	}

}
