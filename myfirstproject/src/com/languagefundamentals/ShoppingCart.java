package com.languagefundamentals;

import java.util.Scanner;

public class ShoppingCart {
	
	static String storeName = "Bajaj Electronics";
	static Scanner sc = new Scanner(System.in);


    String customerName;
    String productName;
    double price;
    int quantity;

    double totalPrice;
    double finalAmount;

    public static void main(String[] args) {

        // First customer
        ShoppingCart s1 = new ShoppingCart();

        System.out.println("Enter Customer Name : ");
        s1.customerName = sc.nextLine();

        System.out.println("Enter Product Details");

        System.out.println("Enter Product Name : ");
        String pname1 = sc.nextLine();

        System.out.println("Enter Price : ");
        double pr1 = sc.nextDouble();

        System.out.println("Enter Quantity : ");
        int qty1 = sc.nextInt();

        System.out.println("Enter Discount : ");
        double dis1 = sc.nextDouble();

        s1.addProduct(pname1, pr1, qty1);
        s1.calculateTotal(dis1);
        s1.displayCart();

        sc.nextLine(); 

 /*       // Second customer
        ShoppingCart s2 = new ShoppingCart();

        System.out.println("\nEnter Customer Name : ");
        s2.customerName = sc.nextLine();

        System.out.println("Enter Product Details");

        System.out.println("Enter Product Name : ");
        String pname2 = sc.nextLine();

        System.out.println("Enter Price : ");
        double pr2 = sc.nextDouble();

        System.out.println("Enter Quantity : ");
        int qty2 = sc.nextInt();

        System.out.println("Enter Discount : ");
        double dis2 = sc.nextDouble();

        s2.addProduct(pname2, pr2, qty2);
        s2.calculateTotal(dis2);
        s2.displayCart();
*/    }

    // Store product details
    void addProduct(String pname, double pr, int qty) {

        productName = pname;
        price = pr;
        quantity = qty;
        System.out.println("Product added successfully!");
    }

    // Calculate total and apply discount
    void calculateTotal(double discount) {

        totalPrice = price * quantity;
        double discountAmount = (totalPrice * discount) / 100;
        finalAmount = totalPrice - discountAmount;
    }

    // Display cart details
    void displayCart() {

        System.out.println("\n----- SHOPPING CART -----");

        System.out.println("Store Name         : " + storeName);
        System.out.println("Customer Name      : " + customerName);
        System.out.println("Product Name       : " + productName);
        System.out.println("Price of Product   : " + price);
        System.out.println("Quantity           : " + quantity);
        System.out.println("Total Price        : " + totalPrice);
        System.out.println("Final Amount       : " + finalAmount);
    }
}