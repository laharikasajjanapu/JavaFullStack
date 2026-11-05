package com.loops;

public class Example1 {

	public static void main(String[] args) {
//		int x=5;
//		for(int i=1;i<=3;i++) {
//			x+=i;
//			x=-i;
//		}
//		System.out.println(x);
		
		int i=0;
		int x=0;
		for(;i<=5;) {
			x+=i--;
			x+=--i;
			System.out.println(i);
		}
		
		System.out.println(--x);

	}

}
