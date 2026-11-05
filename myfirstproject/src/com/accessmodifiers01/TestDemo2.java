package com.accessmodifiers01;

public class TestDemo2 {

	public static void main(String[] args) {
		
//		If the constructor is private, we cannot create the object outside of the classes
		TestDemo1 d1=new TestDemo1();
		
//		If the data is private, we cannot access outside the classes
//		The field TestDemo1.eid is not visible
//		The field TestDemo1.ename is not visible
//		The method method1() from the type TestDemo1 is not visible
//		System.out.println(d1.eid);
//		System.out.println(d1.ename);
//		d1.method1();
		
//		Accessing the <default> data members outside the class within same package
		System.out.println(d1.eid2);
		System.out.println(d1.ename2);
		d1.method2();
		
//		Accessing the public data members within the package
		System.out.println(d1.eid3);
		System.out.println(d1.ename3);
		d1.method3();
		
//		Accessing the Protected data members within the Package outside the class
		System.out.println(d1.eid4);
		System.out.println(d1.ename4);
		d1.method4();


	}

}
