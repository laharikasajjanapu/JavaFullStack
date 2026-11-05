package com.loops;

import java.util.Scanner;

// 12131456 --> 2,3,5,13,31,... upto length
public class PrimeNumbersDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int t = 10;
		int x = n;
		int y = n;
		while (y > 0) {

			while (n > 0) {
				int r = n % t;
				n = n / 10;
				if (isPrime(r)) {
					System.out.println(r);
				}
			}
			t = t * 10;
			n = x;
			y = y / 10;
		}
		sc.close();
	}

	private static boolean isPrime(int r) {
		boolean status = false;
		int count = 0;
		for (int i = 1; i <= r; i++) {
			if (r % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			status = true;
		}

		return status;
	}

}
