package com.arrays;

import java.util.Arrays;

public class SumOfPreviousAndNext {
	
	public static void main(String[] args) {
		
		int[] arr= {1,2,3,4,5,6};//{4,7,6,8}
		
		int temp[] = new int[arr.length];//6
		
		for(int i=0;i<arr.length;i++) {
			if(i==0) {
				temp[i]=arr[i+1];//
			}
			
			else if(i==arr.length-1) {
				temp[i]=arr[i-1];
			}
			else {
				temp[i]=arr[i-1]+arr[i+1];
			}
		}
		
		System.out.println(Arrays.toString(temp));
	}

}
