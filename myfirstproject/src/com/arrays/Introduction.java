package com.arrays;

public class Introduction {

	public static void main(String[] args) {
//		Step 1: Declaration

		int[] arr;

//		Step 2: Creation
//		Variable must provide either dimension expressions or an array initializer
//		java.lang.OutOfMemoryError

//		arr=new int[2147483647];

//		java.lang.NegativeArraySizeException
//		arr=new int[-5];

//		java.lang.ArrayIndexOutOfBoundsException
//		arr=new int[0];

		arr = new int[6];

//		Step 3: Initialization

		arr[0] = 12;
		arr[1] = 13;
		arr[2] = 14;
		arr[3] = 15;
		arr[4] = 16;

//		Step 4:Representation

//		Using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
//		java.lang.ArrayIndexOutOfBoundsException
//		for (int i = 0; i <=arr.length; i++) {
//			System.out.println(arr[i]);
//		}

//		Using for each loop
		for (int n : arr) {
			if (n % 2 == 0) {
				System.out.println(n);
			}
		}
	}

}
