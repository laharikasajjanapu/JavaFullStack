package com.loops;

public class Task1 {

	public static void main(String[] args) {
		// Numbers from 1 to 100
		int i=0;
		System.out.println("---------------Numbers from 0 to 100---------------");
		while(i<=100) {
			System.out.println(i);
			i++;
		}
		
		//Numbers from 100 to 0
		int x=100;
		System.out.println("---------------Numbers from 100 to 0---------------");
		while(x>=0) {
			System.out.println(x);
			x--;
			
		}
		// Even Numbers from 0 to 100
		int a=0;
		System.out.println("---------------Even Numbers from 0 to 100---------------");
		while(a<100) {
			System.out.println(a);
			a=a+2;
		}

		// Odd numbers from 0 to 100
		int b = 1;
		System.out.println("---------------Odd Numbers from 0 to 100---------------");
		while (b < 100) {
			System.out.println(b);
			b = b + 2;
		}
	}

}
