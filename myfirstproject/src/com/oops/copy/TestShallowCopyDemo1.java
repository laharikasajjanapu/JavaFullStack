package com.oops.copy;


class Student implements Cloneable{
	Integer sid;
	String sname;
	Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	public Student(Integer sid,String sname,Address address) {
		this.sid=sid;
		this.sname=sname;
		this.address=address;
	}
}

class Address{
	String city;
	
	public Address(String city) {
		this.city=city;
	}
	
	
}
public class TestShallowCopyDemo1{

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Address add=new Address("Hyderabad");
		Student s1=new Student(1,"Laharika",add);
		
		System.out.println(s1.sid);
		System.out.println(s1.sname);
		System.out.println(s1.address.city);
		System.out.println("-------------------------------------");
		Student s2=(Student) s1.clone();
		
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
