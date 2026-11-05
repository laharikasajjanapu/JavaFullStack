package com.arrays;

public class SumAndProduct {
	
	public static void main(String[] args) {
		
		int arr[]= {2,3,4,5,6};
		
		int sum=0;
		int product=1;		
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		
//		for(int n:arr) {
//			sum+=n;
//		}
		
		
		for(int i=0;i<arr.length;i++) {
			product=product*arr[i];
		}
		
//		for(int n:arr) {
//			product*=n;
//		}
		
		System.out.println("Sum : " + sum);
		System.out.println("Product : " + product);
	}

}
