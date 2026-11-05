package com.languagefundamentals;

public class Literals {
	
	int a=10;
	long b=100000L;
	float height=5.9F;
	String name="Laharika";
	String value=null;
	boolean isJavaSimple=true;
	char gender='A';

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Literals l=new Literals();
		
		// Address of object reference variable
		System.out.println(l); //2b2fa4f7
		System.out.println(l.hashCode()); //724542711
		
		System.out.println(l.a);
		System.out.println(l.b);
		System.out.println(l.height);
		System.out.println(l.name);
		System.out.println(l.value);
		System.out.println(l.isJavaSimple);
		System.out.println(l.gender);
		
		//null can be assigned to reference types like
		// String s=null;
		//Employee e=null;
		// But not to primitive types like int x=null;

	}

}

