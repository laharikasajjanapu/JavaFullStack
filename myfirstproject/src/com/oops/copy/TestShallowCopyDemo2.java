package com.oops.copy;

//Shallow copy using copy constructor
//Shallow copy means creating a new object and copying the values of the original object into it, 
//but the referenced objects are shared between both objects.
class Student2{
	Integer sid;
	String sname;
	Address2 address;
	
	public Student2(Integer sid,String sname,Address2 address) {
		this.sid=sid;
		this.sname=sname;
		this.address=address;
	}
	public Student2(Student2 s2) {
		this.sid=s2.sid;
		this.sname=s2.sname;
		this.address=s2.address;
	}
}

class Address2{
	String city;
	
	public Address2(String city) {
		this.city=city;
	}
	
	public Address2(Address2 address) {
		this.city=address.city;
	}
	
	
}
public class TestShallowCopyDemo2{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address2 add=new Address2("Hyderabad");
		Student2 s1=new Student2(1,"Laharika",add);
		Student2 s2=new Student2(s1);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------------------");

		
//		s2.address = new Address(s1.address.city);
		
		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-------------------------------------");
		
		s2.sid=2;
		s2.sname="Vennela";
		s2.address.city="Banglore";
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------------------");

		System.out.println(s2.sid);
		System.out.println(s2.sname);
		System.out.println(s2.address.city);
		System.out.println("-------------------------------------");
	}

}
