package com.oops;

public class TestEmployee {

	public static void main(String[] args) {
		
		Employee e1=new Employee(3,"Aruna",40000);
		
		System.out.println(e1.eId);
		System.out.println(e1.eName);
		System.out.println(e1.sal);
		
		e1.setEid(2);
		e1.setEname("Laharika");
		e1.setSalary(30000);
		
		System.out.println("Employee Id     : " + e1.getId());
		System.out.println("Employee Name   : " + e1.getName());
		System.out.println("Employee Salary : " + e1.getSalary());
		
		
//		Whenever the data is private,we cannot access outside of the classes
//		CE : The field Employee.employeeId is not visible
//		e1.employeeId=1;
//		e1.employeeName="Vennela";
//		e1.salary=40000;
//		System.out.println(e1.employeeId);
//		System.out.println(e1.employeeName);
//		System.out.println(e1.salary);

	}

}
