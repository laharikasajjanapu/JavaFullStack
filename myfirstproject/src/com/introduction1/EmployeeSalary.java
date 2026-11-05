package com.introduction1;

public class EmployeeSalary {
	String employeeName;
	int monthlySalary;
	double monthlyPF;
	double monthlyGST;
	double netMonthlySalary;
	double annualGST;
	double annualPF;
	double annualNetSalary;
	
	void calculateMonthlyGST() {
		monthlyGST=(monthlySalary * 3)/100;
	}
	
	void calculateMonthlyPF() {
		monthlyPF= monthlySalary * 2/100;
	}
	
	void calculateNetMonthlySalary() {
		netMonthlySalary=monthlySalary- monthlyGST -monthlyPF;
	}
	
	void calculateAnnualGST() {
		annualGST=monthlyGST*12;
	}
	
	void calculateAnnualPF() {
		annualPF=monthlyPF*12;
	}
	
	void calculateAnnualNetSalary() {
		annualNetSalary=netMonthlySalary*12;
	}
	
	void displayEmployeeDetails() {
		System.out.println("Employee Name         : "+ employeeName);
		System.out.println("Employee Salary       : "+ monthlySalary);
		System.out.println("Monthly GST           : "+ monthlyGST);
		System.out.println("Monthly PF            : "+ monthlyPF);
		System.out.println("Net Monthly Salary    : "+ netMonthlySalary);
		System.out.println("Annual GST            : "+ annualGST);
		System.out.println("Annual PF             : "+ annualPF);
		System.out.println("Annual Net Salary     : "+ annualNetSalary);
		
	}
	
	public static void main(String[] args) {
		EmployeeSalary e1=new EmployeeSalary();
		e1.employeeName="James";
		e1.monthlySalary=5000;
		
		e1.calculateMonthlyGST();
		e1.calculateMonthlyPF();
		e1.calculateNetMonthlySalary();
		e1.calculateAnnualGST();
		e1.calculateAnnualPF();
		e1.calculateAnnualNetSalary();
		e1.displayEmployeeDetails();

	}

}
