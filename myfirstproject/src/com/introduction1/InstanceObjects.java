package com.introduction1;

public class InstanceObjects {
	
	static {
		InstanceObjects i=new InstanceObjects();
		i.method1();
		i.method2();
		i.method3();
		i.method4();
		
	}
	
	void method1() {
		System.out.println("method1 called");
	}
	
	void method2() {
		System.out.println("method2 called");
	}
	
	void method3() {
		System.out.println("method3 called");
	}
	void method4() {
		System.out.println("method4 called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
