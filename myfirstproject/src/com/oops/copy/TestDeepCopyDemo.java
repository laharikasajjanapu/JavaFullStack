package com.oops.copy;

//Deep Copy : 
//If we change the copied object, the original object will not be affected.
//means creating a completely independent copy of an original object, 
//including all the objects referenced by it.
class Employee{
	int eid;
	String ename;
	double salary;
	Address1 address;
	
	public Employee(int eid, String ename, double salary,Address1 address) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.address=address;
	}

	public Employee(Employee emp) {
		this.eid=emp.eid;
		this.ename=emp.ename;
		this.salary=emp.salary;
		this.address=new Address1(emp.address);
	}
}

class Address1{
	String city;

	public Address1(String city) {
		super();
		this.city = city;
	}
	public Address1(Address1 address) {
		super();
		this.city=address.city;
	}
	
	
}
public class TestDeepCopyDemo {

	public static void main(String[] args) {
		
		Address1 add=new Address1("Hyderabad");
		Employee emp1=new Employee(101,"Laharika",30000,add);
		
		Employee emp2=new Employee(emp1);
		emp2.eid=2;
		emp2.ename="Vennela";
		System.out.println(emp2.eid);
		System.out.println(emp2.ename);
		System.out.println(emp2.salary);
		System.out.println(emp1.address.city);
		System.out.println(emp2.address.city);
		System.out.println("------------------------------------");
		
		emp2.address.city="Banglore";
		System.out.println(emp1.address.city);
		System.out.println(emp2.address.city);
	}

}
