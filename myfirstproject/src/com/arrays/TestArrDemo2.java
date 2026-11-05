package com.arrays;

// WAP to print highest frequently repeated element more than half of length of an array.
public class TestArrDemo2 {

	public static void main(String[] args) {
		int[] arr= {1,1,1,0,0,1,0};
		boolean[] temp=new boolean[arr.length];
		boolean found=false;
		
		for(int i=0;i<arr.length;i++) {
			int count=0;
			
			if(temp[i]) {
				continue;
			}
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
					temp[j]=true;
				}
			}
			if(count>arr.length/2) {
				found=true;
				System.out.println(arr[i]);
			}
			
		}
		if(!found) {
			System.out.println("No Element Found");
		}

	}

}
