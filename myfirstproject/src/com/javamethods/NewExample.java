package com.javamethods;

public class NewExample {
	
	static int fans=100;
	
	static void show(int x) {
		System.out.println("int");
	}
	
	static void show(double x) {
		System.out.println("double");
	}

	public static void main(String[] args) {
		int fans=200;
		System.out.println(fans);
		System.out.println(NewExample.fans);
		show(10);
		show(10.0f);

	}

}
