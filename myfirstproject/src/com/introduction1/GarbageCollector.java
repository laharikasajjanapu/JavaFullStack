package com.introduction1;

public class GarbageCollector {
	
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Finalise method called");
	}
	
	void hello() {
		System.out.println("Good Morning ! Have a Nice Day..");
		GarbageCollector gc=new GarbageCollector();
		System.out.println(gc);
	}

	public static void main(String[] args) {
		GarbageCollector gc1=new GarbageCollector();
		GarbageCollector gc2=new GarbageCollector();
		GarbageCollector gc3=new GarbageCollector();
		
		//Nullifying Objects 
		gc1=null;
		
		//Re-Assigning Objects
		GarbageCollector gc4=new GarbageCollector();
		gc2=gc4;
		
		//Anonymous Objects
		//Method inside(Local) objects
		
		//new GarbageCollector().hello();
		
		
		System.gc();
		System.out.println(gc1);
		System.out.println(gc2);
		System.out.println(gc3);
		System.out.println(gc4);

	}

}
