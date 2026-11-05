package com.languagefundamentals;

public class Employees {

	String employeeName;
	Integer employeeId;
	String designation;
	Integer salary;
	String remoteLocation;

	static String companyName = "Suntech Solutions";
	static String companyLocation = "Hi-Tech City";

	static {
		System.out.println("Welcome to SunTech Solutions! Employee HRMS Portal");
	}

	void displayEmployeeDetails() {
		System.out.println("Employee Name    : " + employeeName);
		System.out.println("Employee Id      : " + employeeId);
		System.out.println("Designation      : " + designation);
		System.out.println("Current Salary   : " + salary);
		System.out.println("Remote Location  : " + remoteLocation);
		System.out.println("Company Name     : " + companyName);
		System.out.println("Company Location : " + companyLocation);
	}

	String promoteEmployee(String newdesignation) {
		designation=newdesignation;
		return designation;
	}

	int updatesalary(int esalary) {
		salary = salary + esalary;
		return esalary;
	}

	String updateEmployeeLocation(String newremoteLocation) {
		remoteLocation=newremoteLocation;
		return remoteLocation;
	}

	public static void main(String[] args) {
		
		Employees e1 = new Employees();

		e1.employeeName = "Laharika";
		e1.employeeId = 101;
		e1.designation = "Manager";
		e1.salary = 10000;
		e1.remoteLocation = "Hyderabad";
		e1.displayEmployeeDetails();
		System.out.println("***********************************");

		e1.promoteEmployee("Senior Manager");
		e1.updatesalary(20000);
		e1.updateEmployeeLocation("Banglore");
		e1.displayEmployeeDetails();

	}

}
