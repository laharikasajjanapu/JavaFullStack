package com.constructors;

public class Product {
	int productId;
	String productName;
	double price;
	int quantity;

	// No argument constructor
	Product() {
		productId = 101;
		productName = "Laptop";
		price = 30000;
		quantity = 2;
	}

	// Parameterized Constructor
	Product(int productId, String productName, double price, int quantity) {
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}

	double calculateTotalPrice() {
		return price * quantity;
	}

	void display() {
		System.out.println(productId);
		System.out.println(productName);
		System.out.println(price);
		System.out.println(quantity);
		System.out.println("Total Price    : " + calculateTotalPrice());
		System.out.println("-----------------------");
	}

	public static void main(String[] args) {
		Product p1 = new Product();
		p1.display();

		Product p2 = new Product(102, "Mobile", 20000, 3);
		p2.display();

	}

}
