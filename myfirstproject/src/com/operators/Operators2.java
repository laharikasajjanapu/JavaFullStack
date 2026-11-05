package com.operators;

class A{
	
}

class B extends A{
	
}

public class Operators2 {

	public static void main(String[] args) {
		A a=new A();
		B b=new B();
		System.out.println(a instanceof A);//true
		System.out.println(a instanceof Object);//true
		System.out.println(b instanceof B);//true
		System.out.println(b instanceof A);//true
		
		System.out.println(a instanceof B);//false

	}

}
