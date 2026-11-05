package com.accessmodifiers01;

public class TestDemo1 {
	
//	Whenever we don't specify any modifier it will consider as default
//	Default Data Members
	int eid2=2;
	String ename2="Laharika";
	
	void method2() {
		System.out.println("method2 called");
	}
	
	static {
		System.out.println("Static Block Called from TestDemo1");
	}
	
	{
		System.out.println("Instance Block Called from TestDemo1");
	}
	
//	Public Data Members
	public int eid3=3;
	public String ename3="Rasagna";
	
	public void method3() {
		System.out.println("method3 called");
	}
	
	public TestDemo1(){
		System.out.println("No arg Constructor");
	}
	
//	Protected Data Members
	protected int eid4=4;
	protected String ename4="Vaishnavi";
	
	protected void method4() {
		System.out.println("method4 called");
	}
	
//	private TestDemo1(){
//		System.out.println("No arg Constructor");
//	}
	
//	private Data Members
	private int eid=1;
	private String ename="Vennela";
	
	private void method1() {
		System.out.println("method1 called");
	}

	public static void main(String[] args) {
		
		TestDemo1 d1=new TestDemo1();
		
//		Accessing the private data members within the class
		System.out.println(d1.eid);
		System.out.println(d1.ename);
		d1.method1();
		
		
//		Accessing the <default> data members within the class
		System.out.println(d1.eid2);
		System.out.println(d1.ename2);
		d1.method2();
		
//		Accessing the public data members within the class
		System.out.println(d1.eid3);
		System.out.println(d1.ename3);
		d1.method3();
		
//		Accessing the Protected data members within the class
		System.out.println(d1.eid4);
		System.out.println(d1.ename4);
		d1.method4();

	}

}
