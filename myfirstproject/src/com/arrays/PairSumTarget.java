package com.arrays;

public class PairSumTarget {

	public static void main(String[] args) {
		int[] a= {7,0,1,4,3,6,5};// 7,0 - 4,3 - 1,6
		
		int target=7;
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==target) {
					System.out.println(a[i] +" , " + a[j]);
				}
			}
		}
		

	}

}
