package com.languagefundamentals;

public class Courier {
	String customerName;
	Integer courierId;
	String source;
	String destination;
	Integer weight;
	Integer deliveryAmount=0;
	static Integer totalCouriers=0;
	static Integer totalWeight=0;
	static Integer totalAmountCollected=0;
	static Integer priceperkg=100;
	
	static {
		System.out.println("Welcome to Quickship Courier!");
	}
	
	void bookCourier() {
		totalCouriers++;
		deliveryAmount=weight*priceperkg;
		totalWeight+=weight;
		totalAmountCollected=totalAmountCollected+deliveryAmount;
		System.out.println("Booked Successfully");
		
	}
	
	void displayCourierDetails() {
		System.out.println("Customer Name  : " + customerName);
		System.out.println("Courier Id    : " + courierId);
		System.out.println("Source        : " + source);
		System.out.println("Destination   : " + destination);
		System.out.println("Weight        : " + weight);
		System.out.println("Delivery Amount : " + deliveryAmount);
		System.out.println("Price Per KG   : " + priceperkg);
		System.out.println("-------------------------------------------");
	}
	
	static void displayTodaysCollection() {
		System.out.println("Total number of Couriers : " + totalCouriers);
		System.out.println("Total Weight of courier  : "+ totalWeight);
		System.out.println("Total Amount Collected   : " + totalAmountCollected);
	}

	public static void main(String[] args) {
		Courier c1=new Courier();
		Courier c2=new Courier();
		
		c1.customerName="Lahari";
		c1.courierId=2011;
		c1.source="Metpally";
		c1.destination="Jagityal";
		c1.weight=2;
		
		c1.bookCourier();
		c1.displayCourierDetails();
		
		c2.customerName="Vennela";
		c2.courierId=2012;
		c2.source="Armoor";
		c2.destination="Jagityal";
		c2.weight=3;
		
		c2.bookCourier();
		c2.displayCourierDetails();
		
		displayTodaysCollection();

	}

}
