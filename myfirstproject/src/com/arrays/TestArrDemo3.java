package com.arrays;

//0
//0
//1
//1
public class TestArrDemo3 {

	public static void main(String[] args) {
		
		int arr[][]= {{8,9},{7,8},{1,8},{2,10}};
		
		for(int i=0;i<arr.length;i++) {
			int start=arr[i][0];
			int end=arr[i][1];
			int value=0;
			
			for(int j=0;j<arr.length;j++) {
				int nextStart=arr[j][0];
				int nextEnd=arr[j][1];
				
				if(j!=i) {
					if(nextStart>=start && nextEnd<=end) {
						value=1;
					}
				}
				
			}
			
			System.out.println(value);
			
		}

	}

}
