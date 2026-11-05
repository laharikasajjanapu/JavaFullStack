package com.loops;

import java.util.Scanner;

public class EvenDigitsSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int evenSum = evenDigitSum(n);
		System.out.println("Sum of Even Digits  : " + evenSum);
		int oddSum = oddDigitSum(n);
		System.out.println("Sum of Odd Digits   : " + oddSum);
		frequencyCount(n);
		sc.close();

	}

	static int evenDigitSum(int n) {
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (r % 2 == 0) {
				sum = sum + r;
			}
		}
		return sum;
	}

	static int oddDigitSum(int n) {
		int r = 0;
		int sum = 0;
		while (n > 0) {
			r = n % 10;
			n = n / 10;
			if (r % 2 != 0) {
				sum = sum + r;
			}
		}
		return sum;
	}

	static void frequencyCount(int n) {
		for (int i = 0; i <= 9; i++) {
			int temp=n;
			int r = 0;
			int count=0;
			while (temp > 0) {
				r = temp % 10;
				if(r==i) {
					count++;
				}
				temp = temp / 10;
			}
			System.out.println("Count Of " + i + " is " + count);

		}
	}

}
