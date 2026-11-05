package com.introduction1;

public class Test {
	
	protected void finalize() throws Throwable{
		System.out.println("GC removed object");
	}
	
	static int n=0;
	
	{
		n++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t=new Test();
		Test t1=new Test();
		Test t2=new Test();
		System.out.println(t);
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(n);
		System.gc();

	}

}