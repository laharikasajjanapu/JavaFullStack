package com.arrays;

import java.util.Arrays;

public class LeftRotate {

	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50};
		int k=2;
		
		for(int i=0;i<k;i++) {
			int first=arr[0];
			for(int j=0;j<arr.length-1;j++) {
				arr[j]=arr[j+1];
			}
			arr[arr.length-1]=first;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int x:arr) {
			System.out.print(x + " ");
		}

	}

}
