package com.loops;

import java.util.Scanner;

public class CinemaCounter {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int option;
		do {
			
		System.out.println("1. Select Movie     ");
		System.out.println("2. Select seat type ");
		System.out.println("3. Exit");
		System.out.println("Enter your choice");
		option=sc.nextInt();
		switch(option) {
		case 1->{
			System.out.println("1. Avengers Endgame");
			System.out.println("2. Inception");
			System.out.println("3. Interstellar");
			System.out.println("Enter your choice");
			int choice=sc.nextInt();
			if(choice==1 || choice==2 || choice==3) {
				System.out.println("1. Regular");
				System.out.println("2. Premium");
				System.out.println("3. Recliner");
				System.out.println("Enter your Seat Type");
				int seatType=sc.nextInt();
				if(seatType==1 || seatType==2 || seatType==3) {
					System.out.println("Thank you fro booking...");
				}
				else {
					System.out.println("Invalid choice");
				}
			}
			
			else {
				System.out.println("Invalid choice");
			}
		}
		
		case 2->{
			System.out.println("1. Regular");
			System.out.println("2. Premium");
			System.out.println("3. Recliner");
			System.out.println("Enter your Seat Type");
			 int seat = sc.nextInt();

             if (seat == 1 || seat == 2 || seat == 3) {
                 System.out.println("Seat type selected successfully.");
             } else {
                 System.out.println("Invalid seat type.");
             }

		}
		
		case 3->{
			System.out.println("Exiting...");
		}

        default -> {
        	System.out.println("Invalid choice");
        }
		}
		
		}while(option!=3);
		
		sc.close();

	}

}
