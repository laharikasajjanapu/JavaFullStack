package com.accessmodifiers02;

import com.accessmodifiers01.TestDemo1;

public class TestDemo3 extends TestDemo1{

	public static void main(String[] args) {
		
		TestDemo1 d1=new TestDemo1();
		
//		If the class is public and constructor is public 
//		Accessing the default data members from another package is not possible
		
//		System.out.println(d1.eid2);
//		System.out.println(d1.ename2);
//		d1.method2();
		
//		Accessing the public data members outside the package
		System.out.println(d1.eid3);
		System.out.println(d1.ename3);
		d1.method3();
		
//		Accessing the Protected data members outside the package is not possible directly
//		Scope : Within the class,within the package,
//		outside of the packages of subclasses with sub class object reference only
		
		TestDemo3 d2=new TestDemo3();
		
		System.out.println(d2.eid4);
		System.out.println(d2.ename4);
		d2.method4();

	}

}
