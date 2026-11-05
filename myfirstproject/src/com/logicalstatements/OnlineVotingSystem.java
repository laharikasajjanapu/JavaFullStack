package com.logicalstatements;

import java.util.Scanner;

public class OnlineVotingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter yout Age : ");
		int age=sc.nextInt();
		if(age<18) {
			System.out.println("Not Eligible");
		}
		else if(age>18) {
			System.out.println("Enter Your Gender");
			char gender=sc.next().charAt(0);
			if(gender=='M' || gender=='F') {
				System.out.println("Enter your Voter Id ");
				String voterId=sc.next();
				System.out.println("Choose 1 to vote for Vennela");
				System.out.println("Choose 2 to vote for Laharika");
				System.out.println("Choose 3 to vote for Srivani");
				System.out.println("Choose 4 to vote for Abhigna");
				System.out.println("Enter Your Option");
				int option=sc.nextInt();
				switch(option) {
				case 1->{
					System.out.println("Vote is captured for Vennela");
				}	
				case 2->{
					System.out.println("Vote is captured for Laharika");
				}
				case 3->{
					System.out.println("Vote is captured for Srivani");
				}
				case 4->{
					System.out.println("Vote is captured for Abhigna");
				}
				default -> System.out.println("Thanks for Voting to NOTA");
				
				}
			}
			else {
				System.out.println("Not eligible");
			}
		}
		sc.close();

	}

}
