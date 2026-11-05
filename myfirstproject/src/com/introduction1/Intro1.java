package com.introduction1;

public class Intro1 {
	static int age=10;
	int a=10;
	int b=10;
	
	void add() {
		int c=a+b;
		System.out.println(c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intro1 in=new Intro1();
		in.add();
		System.out.println(Intro1.age);

	}

}
