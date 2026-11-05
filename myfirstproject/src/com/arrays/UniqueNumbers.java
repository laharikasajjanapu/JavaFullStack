package com.arrays;

import java.util.Scanner;

// Display the repeated numbers uniquely from an array
public class UniqueNumbers {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // First take all inputs
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Now check for repeated numbers
        for (int i = 0; i < arr.length; i++) {

            int count = 0;

            // Check whether the number was already checked
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }
            }

            if (count > 0) {
                continue;
            }

            // Check whether the number repeats
            int repeat = 0;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[i] == arr[k]) {
                    repeat++;
                }
            }

            if (repeat > 0) {
                System.out.println(arr[i]);
            }
        }

        sc.close();
    }
}
