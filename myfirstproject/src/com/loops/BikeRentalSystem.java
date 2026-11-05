package com.loops;

import java.util.Scanner;

public class BikeRentalSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double RATE_PER_HOUR=50;
		double totalIncome=0;
		System.out.println("Enter the number of customers");
		int customers=sc.nextInt();
		
		for(int i=1;i<=customers;i++) {
			System.out.println("Enter number of bikes rented by customer " + i + " :   ");
			int numberOfBikes=sc.nextInt();
			double customerBill=0;
			int count=1;
			while(count<=numberOfBikes) {
				System.out.println("Enter hours for Bike " + count + ":   ");
				int hours=sc.nextInt();
				double charge=hours+RATE_PER_HOUR;
				if(hours>=5) {
					charge=charge-(charge*0.10);
				}
				System.out.println("Charge for Bike " + count + "  :  " + charge);
				customerBill=customerBill+charge;
				count++;
			}
			System.out.println("Bill for Customer " + i + ":   "+ customerBill);
			totalIncome=totalIncome+customerBill;
		}
		System.out.println("Total Income for the day :   " + totalIncome);
		sc.close();

	}

}
