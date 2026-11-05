package com.introduction1;

public class DataTypes {
	
	{
		System.out.println("hellooo");
		//DataTypes t=new DataTypes(); ---- stack Overflow
	}

	public static void main(String[] args) {
		int a=130;
		byte b= (byte)a;     // Explicit Type Casting
		System.out.println(b);
		byte b2=120;
		byte c=(byte)(b2+12);
		char c1=120;
		int c2=(char)c1;
//		double a=25.99d;
//		int b=(int)a;
//		char c=97;
		
		System.out.println(c);
		System.out.println(b);
		System.out.println(c1);
		System.out.println(c2);
		DataTypes t=new DataTypes();
		System.out.println(t);

	}

}
