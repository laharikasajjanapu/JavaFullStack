package com.loops;

import java.util.Scanner;

//Find the second perfect number in range 1 to 100 --6,24,496,8128
public class TesDemoloop1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int count=0;

        for (int n=1;n<=100;n++) {
        	int sum=0;

            for (int i=1;i<n;i++) {
                if (n%i==0) {
                    sum = sum + i;
                }
            }
            if (sum==n) {
                count++;
                if (count==2) {
                    System.out.println("Second perfect number is " + n);
                }
            }
        }
		sc.close();

	}

}
