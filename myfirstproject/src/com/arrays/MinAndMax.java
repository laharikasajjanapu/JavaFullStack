package com.arrays;

public class MinAndMax {

	public static void main(String[] args) {
		
		int[] arr= {5,2,6,9,1};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(min<arr[i]) {
				min=arr[i];
			}
			else if(max>arr[i]) {
				max=arr[i];
			}
		}
		
		System.out.println("Minimum number is : " + min);
		System.out.println("Maximum number is : " + max);

	}

}
