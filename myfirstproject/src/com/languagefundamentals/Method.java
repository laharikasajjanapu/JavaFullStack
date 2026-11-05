package com.languagefundamentals;

public class Method {
	static int x=10;
	void change() {
		x=x+10;
	}
	
	public static void main(String[] args) {
		Method m1=new Method();
		Method m2=new Method();
		m1.change();
		
		System.out.println(m1.x); //20
		m2.change();
		
		System.out.println(m2.x); //30
		
		Integer a=200;
		Integer b=200;
		System.out.println(a == b);  //false
		
		// As Integer is a wrapper class and it range is -128 to 127 ,so it does not compare out of range values,
		// Wrapper Class Caching
		if (a == b) {
			System.out.println("TRUE");
		}
		else {
			System.out.println("FALSE"); // FALSE
		}
		//double y=x;
		System.out.println(a + "" + b);
		System.out.println(a+b+" " +a+b);

	}

}
