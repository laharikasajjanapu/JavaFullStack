package com.arrays;

import java.util.Arrays;

public class Digits {

	public static void main(String[] args) {
		
		Integer[] arr1= {1,0,2,0,3,0,5,0};
		Integer[] arr2= {1,0,2,0,3,0,5,0};
		
		int index1=0;
		int index2=arr2.length-1;
		
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=0) {
				int temp=arr1[i];
				arr1[i]=arr1[index1];
				arr1[index1]=temp;
				index1++;
			}
		}
		
		System.out.println(Arrays.toString(arr1));
		
		for(int i=arr2.length-1;i>=0;i--) {
			if(arr2[i]!=0) {
				int temp=arr2[i];
				arr2[i]=arr2[index2];
				arr2[index2]=temp;
				index2--;
			}
		}
		
		
		System.out.println(Arrays.toString(arr1));

	}

}
