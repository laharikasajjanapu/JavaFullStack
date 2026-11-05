package com.languagefundamentals;

public class CountOfObjects {
	
	static int count=0;
	
	CountOfObjects(){
		count++;
	}

	public static void main(String[] args) {
		CountOfObjects c1=new CountOfObjects();
		CountOfObjects c2=new CountOfObjects();
		CountOfObjects c3=new CountOfObjects();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println("Count Of Objects  : " + count);

	}

}
