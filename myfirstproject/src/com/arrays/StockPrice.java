package com.arrays;
//min=2
//9-2=7

public class StockPrice {

	public static void main(String[] args) {
		
		String[] days= {"SUN","MON","TUES","WED","THU","FRI","SAT"};
		int[] arr= {10,2,9,6,5,7,9};
		
		String buyDay="";
		String sellDay="";
		
		int[] temp=new int[arr.length];
		
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
				buyDay=days[i];
			}
		}

		System.out.println(buyDay);
		
		for(int i=1;i<arr.length-1;i++) {
			temp[i]=arr[i]-min;
			if(temp[i]>max) {
				max=temp[i];
				sellDay=days[i];
			}
			
		}
		System.out.println(sellDay);

	}
	
	//arr[j] - arr[i] then max=that value 

}
