package com.languagefundamentals;

public class TestLiteralsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float f1=123;
		float f2=0123;
		
		//cannot convert from double to float
		//float f3=123.5;
		float f4=123.5F;
		float f5=0123.5F;
		float f6=123F;
		float f7=0123F;
		float f8=0x123F;
		
		//Invalid hex literal number
		//float f9=0x123.5F;
		
		//Invalid hex literal number
		//float f10=0x123.5;
		
		//Invalid hex literal number
		//float f11=0xabc.5F;
		byte b=10;
		b+=5;
		System.out.println(b);
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f4);
		System.out.println(f5);
		System.out.println(f6);
		System.out.println(f7);
		System.out.println(f8);
		
	}

}