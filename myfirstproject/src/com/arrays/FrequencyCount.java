package com.arrays;

import java.util.Scanner;

// Output :-
// 10 : 3
// 20 : 2
// 30 : 2

public class FrequencyCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size : "); //7
		int size=sc.nextInt();
		int[] arr=new int[size];
		boolean[] rept=new boolean[size];
		
		System.out.println("Enter the elements"); // 10 20 10 20 30 10 30
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<size;i++) {
			
			if(rept[i]) {
				continue;
			}
			int count=0;
			for(int j=0;j<size;j++) {
				if(arr[i]==arr[j]) {
					count++;
					rept[j]=true;
				}
			}
			
			System.out.println(arr[i] + " 3" + count);
		}
		
		sc.close();
		

	}

}
