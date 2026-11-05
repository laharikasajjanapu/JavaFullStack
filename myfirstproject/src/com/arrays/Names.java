package com.arrays;

// WAP to print names using arrays
public class Names {

	public static void main(String[] args) {

//		int[] i=new int['A']; size is 65
		
		
//		cannot convert from float to int
//		float[] f=new float[2.3f];
		
		float[] f1=new float[3];
		
		f1[0]=2.3f;
		
		double[] d=new double[(int)2.3];
		d[0]=2.3f;
		for(double d1: d) {
			System.out.println(d1);
		}

		char[] ch = new char['A'];

//		Output is special character for 23 ascii value
		ch[0] = 'B';

//		System.out.println(ch[0]);

//		String[] name=new String['A'];
		
		int count=0;

		String[] names = new String[4];

		names[0] = "srivani";
		names[1] = "vennela";
		names[2] = "sachin";
		names[3] = "lahari";

		for (String n : names) {
			if (n.toUpperCase().startsWith("S")) {
				System.out.println(n);
			}

		}
		
		for(int n1: ch) {
			count++;
			System.out.println(n1);
		}
		System.out.println(count);
		
		
		for(float n2: f1) {
			System.out.println(n2);
		}
	}
}
