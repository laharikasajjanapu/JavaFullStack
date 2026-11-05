package com.introduction1;


class A{
	B b;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from A ");
	}
	
}
class B{
	A a;
	@Override
	protected void finalize() throws Throwable {
		System.out.println("finalize method called from A ");
	}
}

public class TestDemo5 {

	public static void main(String[] args) {
		
		System.out.println("Main Method Started ");
		A obj1=new A(); 
		B obj2=new B();
		
		obj1.b=obj2;  //A's b points to B
		obj2.a=obj1;  //B's a points to A
		
		obj1=null;
		obj2=null;
		
		System.out.println(obj1);
		//the objects can still point to each other, but they are no longer reachable from gc roots
		System.out.println("Main Method Started ");
		
		System.gc();

	}

}
