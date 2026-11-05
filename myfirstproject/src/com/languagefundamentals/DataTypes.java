package com.languagefundamentals;
import java.math.BigInteger;

public class DataTypes {
	
	// As BigInteger is a class so we need to crate an object for that and we need to access through the object reference
	BigInteger bi=new BigInteger("123");

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TO know the range of data types we use MIN_VALUE AND MAX_VALUE With respect to the wrapper class like Integer,Short etc
		
		char c='A';
		System.out.println((int)c);
		System.out.println(Long.MIN_VALUE);
		
		
		DataTypes d=new DataTypes();
		System.out.println(d.bi);
		
		//To convert a string into Integer we use parseInt method with respect to wrapper class object data type
		String age="22";
		int age1=Integer.parseInt(age);
		System.out.println(age1);
		
		
		//For character range we use integer data type for type conversion
		System.out.println((int)Character.MIN_VALUE);
		System.out.println((int)Character.MAX_VALUE);

	}

}
