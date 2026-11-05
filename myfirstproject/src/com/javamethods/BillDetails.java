package com.javamethods;
import java.util.Scanner; 

public class BillDetails {
	
	static Scanner sc=new Scanner(System.in);
	int price,taxAmount;
	public static void main(String[] args) {

		BillDetails b1=new BillDetails();
		int taxAmount=b1.taxAmount();
		System.out.println("Tax Amount  :  "+ taxAmount);
		System.out.println("Final Amount : " + b1.finalPrice());
		

	}
	int taxAmount() {
		System.out.println("Enter the price  ");
		int price=sc.nextInt();
		System.out.println("Enter Tax percentage : ");
		int taxpercent=sc.nextInt();
		int taxamount=(price*taxpercent)/100;
		return taxamount;
	}
	int finalPrice() {
		return price + taxAmount;
	}

}
