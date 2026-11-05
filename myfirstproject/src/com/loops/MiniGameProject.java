package com.loops;

import java.util.Random;
import java.util.Scanner;

public class MiniGameProject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int x=r.nextInt(1,11);
		for(int i=3;i>=1;i--) {
			System.out.println("Enter a number to guess...");
			int n=sc.nextInt();
			if(n==x) {
				System.out.println("You won");
				break;
			}			
			if(i>0) {
				System.out.println("Wrong Guess try again you have more " + i + "chances");
			}
			
			else {
				System.out.println("Better luck next time");
				System.out.println("The number was: " + x);
			}
		}
		sc.close();

	}

}
