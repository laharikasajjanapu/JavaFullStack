package com.languagefundamentals;
import java.math.BigInteger;
import java.math.BigDecimal;
import java.util.Arrays;

class Dog{
	
}

public class DataTypes1 {
	
	//Normal Object Data Types
	
	//Type mismatch: cannot convert from int to BigInteger
	BigInteger bi1=new BigInteger("104567897234567892345678");
	BigInteger bi2=new BigInteger("104567897234567811111111");
	BigDecimal bd1=new BigDecimal(109876543490216489098.23456349887654234567);
	BigDecimal bd2=new BigDecimal(109876543456789345498.23456987347654234567);
	String s;
	Arrays a;
	
	//Wrapper Object Data Types
	Integer i=10;
	Short s1=23444;
	Character c='A';
	Double db=7392845.7889;
	
	//User-Defined data type
	Dog d;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method Started");
		DataTypes1 d1=new DataTypes1();
		System.out.println(d1.bi1);// null
		System.out.println(d1.bi2);
		
		//Methods of BigInteger
		//Returns a BigInteger whose value is (this + val)
		System.out.println(d1.bi1.add(d1.bi2));
		System.out.println();
		//Returns a BigInteger whose value is (this * val)
		System.out.println(d1.bi1.multiply(d1.bi2));
		System.out.println();
		//Compares this BigInteger with the specified BigInteger
		System.out.println(d1.bi1.compareTo(d1.bi2)); //0
		//Returns a BigInteger whose value is (this / value)
		System.out.println(d1.bi1.divide(d1.bi2));//1
		//converts bigInteger into float
		System.out.println(d1.bi1.floatValue());
		//returns maximum value
		System.out.println(d1.bi1.max(d1.bi2));
		//returns minimum value
		System.out.println(d1.bi1.min(d1.bi2));
		//returns modulus value
		System.out.println(d1.bi1.mod(d1.bi2));
		//Returns the decimal String representation of this BigInteger
		System.out.println(d1.bi1.toString());
		//Returns a BigInteger whose value is (~this)
		System.out.println(d1.bi1.not());
		//Returns true if this BigInteger is probably prime, false if it's definitely composite.
		System.out.println(d1.bi1.isProbablePrime(10));
		//converts BigInteger into long
		System.out.println(d1.bi1.longValue());
		
		//Big Decimal
		System.out.println(d1.bd1);
		System.out.println(d1.bd2);
		//Addition and Multiplication
		System.out.println(d1.bd1.add(d1.bd2));//null
		System.out.println(d1.bd1.multiply(d1.bd2));
		
		//Returns a BigDecimal whose value is the absolute value of this BigDecimal'
		System.out.println(d1.bd1.abs());
		//Converts this BigDecimal to an int.
		System.out.println(d1.bd1.intValue());
		//Converts this BigDecimal to a float
		System.out.println(d1.bd1.floatValue());
		//Converts this BigDecimal to a long.
		System.out.println(d1.bd1.longValue());

		
		System.out.println(d1.s);//null
		System.out.println(d1.a);//null
		System.out.println(d1.i);//null
		System.out.println(d1.s1);//null
		System.out.println(d1.c);//null
		System.out.println(d1.db);//null

	}

}
