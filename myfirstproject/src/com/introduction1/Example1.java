package com.introduction1;

public class Example1 {

	public static void main(String[] args) {
//	int x=20;
//	if(x>10) {
//		x=5;
//		System.out.println(x);
//	}
//	else if(x>5) {
//		x=15;
//		System.out.println(x);
//	}
//	if(x>10) 
//		System.out.println("A");
//	else
//		System.out.println("B");
//	}
		
		int x=10;
		int y=x++>10 ? ++x : x++;
		System.out.println(x);
		System.out.println(y);
//	int x=5;
//	x=++x + x++ + --x - --x +x++;
//	// 6
//	//6->7
//	//6
//	//-5
//	//+5
//	System.out.println(x);
	}
	

}
