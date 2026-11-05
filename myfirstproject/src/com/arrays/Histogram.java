package com.arrays;



public class Histogram {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 6, 2, 3 };
		int max=Integer.MIN_VALUE;
		int element=0;

		for (int i = 0; i < arr.length - 1; i++) { 
			int count=1;
			int left = i - 1;// -1 0
			int right = i + 1;// 1 2 

			while (left >= 0 && arr[i] <= arr[left]) { 
				count++;
				left--;
			}
			while (right < arr.length && arr[i] <= arr[right]) { 
				count++;
				right++;
			}
			
			int area=arr[i]*count;
			if(area>max) {
				max=area;
				element=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(element);
		
	}

}
