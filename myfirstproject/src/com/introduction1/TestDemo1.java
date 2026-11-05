package com.introduction1;

public class TestDemo1 {
	
	static TestDemo1 t1=new TestDemo1();
	
	static void method1(){
		System.out.println("method 1 called");
		method2();
	}
	
	static void method2() {
		System.out.println("method 2 called");
		t1.method3();

	}
	
	void method3() {
		System.out.println("method3 called");
		method4();
	}
	
	void method4() {
		System.out.println("method4 called");
		method1();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	method1();

	}

}
