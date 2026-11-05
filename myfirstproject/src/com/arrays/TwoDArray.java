package com.arrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter row size :");
		int rowSize = sc.nextInt();
		System.out.println("Enter column size :");
		int columnSize = sc.nextInt();

		int[][] arr = new int[rowSize][columnSize];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr[i].length; j++) {
					int temp = arr[i][j];
					arr[i][j] = arr[j][i];
					arr[j][i] = temp;
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}

			System.out.println();
		}
		
		sc.close();

	}

}
