package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class KLargestElement {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int[] arr= {2,16,5,8,7,45,3,5};
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Enter K for largest number");
		int k=sc.nextInt();
		int kLargest=arr[k-1];
		
		System.out.println(kLargest);
		System.out.println(Arrays.toString(arr));
		
		sc.close();
	}

}
