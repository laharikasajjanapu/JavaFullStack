package com.introduction1;

public class ShoppingCart {
	int items;
	double totalAmount;
	String orderPlaced=" No ";
	static String website="Pizzahut";
	
	void addItem() {
		items++;
		totalAmount+=200;
		System.out.println("Item Status   : "+items);
		System.out.println("Total Amount Updated   : " + totalAmount);
	}
	
	void placeOrder() {
		orderPlaced="Yes";
		System.out.println("Order Placed Status : "+ orderPlaced);
	}
	
	void displayCart() {
		System.out.println("Website Name    : " + website);
		System.out.println("Number of Items : "+ items);
		System.out.println("Total Amount    : "+ totalAmount);
		
	}
	
	static void changeWebsite() {
		website="Dominos";
	}
	static void displayWebsite() {
		System.out.println("Website Name:  :  " + website);
	}

	public static void main(String[] args) {
		ShoppingCart cart1=new ShoppingCart();
		ShoppingCart cart2=new ShoppingCart();
		
		cart1.items=2;
		cart1.totalAmount=500;
		
		cart2.items=3;
		cart2.totalAmount=400;
		
		System.out.println("---------------------Before Update-------------------");
		cart1.displayCart();
		cart2.displayCart();
		
		ShoppingCart.changeWebsite();
		
		System.out.println("----------------------After Update------------------");
		cart1.placeOrder();
		cart1.displayCart();
		
		System.out.println("************************");
		
		cart2.addItem();
		cart2.displayCart();

	}

}
