package com.loops;

public class Arrays {

	public static void main(String[] args) {
		int[] a= {1,2,3,4};
		c(a);
		for(int i:a) {
			System.out.print(i + " ");
		}
		
		int x=10;
		if(x++ > 10) {
			System.out.println("A");
		}
		else if(++x > 11) {
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
		System.out.println(x);

	}
	
	static void c(int[] a) {
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i] + a[i+1];
			a[i+1]=a[i]-a[i+1];
		}
	}


}
