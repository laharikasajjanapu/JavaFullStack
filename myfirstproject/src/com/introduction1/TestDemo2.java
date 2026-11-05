package com.introduction1;

public class TestDemo2 {

	public static native long currentTimeMillis();

	static int a = 20;
	static int b = 20;

	int c = 30;
	int d = 40;

	static void add() {
		int c=a+b;
		System.out.println(c);
		sub();
	}

	static void sub() {
		System.out.println(a - b);
		TestDemo2 t1 = new TestDemo2();
		System.out.println(t1.c + t1.d);
		t1.mult();
	}

	void mult() {
		System.out.println(c * d);
		division();
	}

	void division() {
		float e = 20;
		float f = 40;
		System.out.println(e / f);

	}

	public static void main(String[] args) {
		add();
		long time = System.currentTimeMillis();
		System.out.println(time);
	}

}
