package com.arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 5, 7, 9 };

		for (int i = 0; i < arr.length - 1; i++) {

			if ((arr[i + 1] - arr[i]) > 1) {
				System.out.print(arr[i] + 1 + " ");
			}

		}

		System.out.println();

		int[] arr2 = { 1, 4, 5, 9, 11 };
		for (int i = 0; i < arr2.length - 1; i++) {
			int start = arr2[i];
			int end = arr2[i + 1];
			for (int j = start + 1; j < end; j++) {
				System.out.println(j);
			}
		}

	}

}
