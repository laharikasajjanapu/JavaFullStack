package com.arrays;

import java.util.Scanner;

public class SecondMax {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		Integer[] arr= {2,3,6,1,8,5};
		
		
		int max=Integer.MIN_VALUE;
		int second_Max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				second_Max=max;
				max=arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(second_Max);
		
		
		sc.close();
	}

}
