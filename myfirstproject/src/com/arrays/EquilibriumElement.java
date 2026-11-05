package com.arrays;

public class EquilibriumElement {

	public static void main(String[] args) {
		int[] arr= {1,3,5,2,2};
		
		for(int i=0;i<arr.length;i++) { //0 1 2
			int leftSum=0;
			int rightSum=0;
			int left=i-1;// -1 0 1
			int right=i+1;// 1 2 3
			while(left>=0) {
				leftSum+=arr[left]; //3+1=4
				left--;
			}
			while(right<arr.length) {
				rightSum+=arr[right];//3+5+2+2 //5+2+2 //2+2
				right++;//2 3 4 5
			}
			
			if(leftSum==rightSum) {
				// -1 == 12 x
				//  1 == 9  x
				//  4 == 4  x
				
				System.out.println(arr[i] + " " + i );
			}
		}
		

	}

}
