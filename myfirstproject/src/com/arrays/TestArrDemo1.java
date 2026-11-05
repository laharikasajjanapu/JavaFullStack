package com.arrays;

public class TestArrDemo1 {

	public static void main(String[] args) {
		
		int[] marks= {98,97,96,95,94,93};
		int totalMarks=0;
		int average=0;
		
		for(int i=0;i<marks.length;i++) {
			totalMarks=totalMarks+marks[i];
		}
		
//		for(int n:marks) {
//			totalMarks+=n;
//		}
		
		average=totalMarks/marks.length;
		
		
		System.out.println("Total Marks : " + totalMarks);
		System.out.println("Average : " + average);
	}

}
