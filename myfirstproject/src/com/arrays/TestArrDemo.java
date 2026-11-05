package com.arrays;

import java.util.Arrays;

// [36,45,78,66,79] --> [40,40,80,70,80]
public class TestArrDemo {

	public static void main(String[] args) {
		
		int[] arr= {36,45,78,66,79};
		
		for(int i=0;i<arr.length;i++) {
			int r=arr[i]%10;
			if(r>5) {
				arr[i] = arr[i] + (10 - r);
			}
			else if(r<=5) {
				arr[i]=arr[i]-r;
			}
			
		}
		System.out.println(Arrays.toString(arr));
	
	}

}
