package com.languagefundamentals;
import java.util.Scanner;

public class ZoomCarRentals {
	static Scanner sc=new Scanner(System.in);
	String nameOfCompany() {
		return "Mahindra";
	}
	
	static int rentalRate() {
		int rate=1500;
		return rate;
	}
	
	static int fixedInsurance() {
		return 500;
	}
	
	int rentalCost(int rate) {
		System.out.println("Enter Number Of days : ");
		int days=sc.nextInt();
		int rentalCost=(rate*days);
		return rentalCost;
	}
	
	int totalAmount(int rentalCost,int insurance) {
		return rentalCost+insurance;
	}
	
	String welcome() {
		String welcome="Welcome to Zoom Car Rentals";
		return welcome;
	}
	

	public static void main(String[] args) {
		ZoomCarRentals zc1=new ZoomCarRentals();
		System.out.println(zc1.welcome());
		System.out.println("-------------------------------------------");
		System.out.println("Name of Company  :  " +zc1.nameOfCompany());
		int rate=rentalRate();
		System.out.println("Rental Rate      :  " + rate);
		int insurance=fixedInsurance();
		System.out.println("Fixed Insurance  :  " + insurance);
		int rentalCost=zc1.rentalCost(rate);
		System.out.println("Rental Cost      :  " + rentalCost);
		int totalAmount=zc1.totalAmount(rentalCost, insurance);
		System.out.println("Total Amount     :  " + totalAmount);
		
		
	}

}
