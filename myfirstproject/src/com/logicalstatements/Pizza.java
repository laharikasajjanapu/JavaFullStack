package com.logicalstatements;

import java.util.Scanner;

public class Pizza {

	double deliveryCharge;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Dominos !!!");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Pizza");
		char size=sc.next().charAt(0);
		double price=getPizzaPrice(size);
		
		System.out.println("Enter quantity of the pizza");
		int quantity=sc.nextInt();
		double totalCost=calculatePizzaCost(price,quantity);
		
		System.out.println("Enter distance ");
		int distance=sc.nextInt();
		double deliveryCharges=claculateDeliveryCharge(distance);
		
		double finalBill=calculateFinalBill(totalCost,deliveryCharges);
		
		System.out.println("Size of the Pizza   : " + size);
		System.out.println("Price of Pizza      : " + price);
		System.out.println("Quantity of Pizza   : " + quantity);
		System.out.println("Total Cost of Pizza : " + totalCost);
		System.out.println("Delivery Charge     : " + deliveryCharges);
		System.out.println("Final Bill          : " + finalBill);
		sc.close();

	}
	
	static double getPizzaPrice(char size) {
		double price=0;
		if(size=='S') {
			price=70;
		}
		else if(size=='M') {
			price=100;
		}
		else if(size=='L') {
			price=150;
		}
		else {
			System.out.println("Invalid Size");
		}
		
		return price;
	}
	static double calculatePizzaCost(double price,int quantity) {
		if(quantity<=0) {
			return -1;
		}
		return price*quantity;
	}
	
	static double claculateDeliveryCharge(double distance) {
		double deliveryCharges=0;
		if(distance<0) {
			return -1;
		}
		else if(distance>=0 && distance<=10) {
			deliveryCharges=70;
		}
		else if(distance>=11 && distance<=20) {
			deliveryCharges=100;
		}
		else if(distance>20) {
			deliveryCharges=150;
		}
		else {
			System.out.println("Invalid Distance");
		}
		
		return deliveryCharges;	
		
	}
	
	static double calculateFinalBill(double pizzaCost,double deliveryCharge) {
		return pizzaCost+deliveryCharge;
	}
	
//	void display() {
//		System.out.println("Size of the Pizza   : "+ size);
//		System.out.println("Price of Pizza      : " + price);
//		System.out.println("Quantity of Pizza   : " + quantity);
//		System.out.println("Total Cost of Pizza : " + totalCost);
//		System.out.println("Delivery Charge     : " + deliveryCharges);
//		System.out.println("Final Bill          : " + finalBill);
//	}
//	

}
