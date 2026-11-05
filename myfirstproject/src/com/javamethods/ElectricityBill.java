package com.javamethods;

import java.util.Scanner;

// With Return Type + No Parameters

public class ElectricityBill {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("main method started !!");

        ElectricityBill eb = new ElectricityBill();

        int id = eb.customerId();
        String name = eb.customerName();

        double previous = eb.previousReading();
        double current = eb.currentReading();

        double units = eb.unitsConsumed();
        double price = eb.pricePerUnit();
        double fixed = eb.fixedCharge();

        double tax = eb.taxAmount();
        double discount = eb.discountAmount();

        double bill = eb.finalBill();

        System.out.println("----- ELECTRICITY BILL -----");

        System.out.println("Customer ID       : " + id);
        System.out.println("Customer Name     : " + name);
        System.out.println("Previous Reading  : " + previous);
        System.out.println("Current Reading   : " + current);
        System.out.println("Final Bill        : " + units);
        System.out.println("Units Consumed    : " + (current-previous));
        System.out.println("Price Per Unit    : " + price);
        System.out.println("Fixed Charge      : " + fixed);
        System.out.println("Tax Amount        : " + tax);
        System.out.println("Discount Amount   : " + discount);
        System.out.println("Final Bill        : " + bill);

        System.out.println("\nmain method ended !!");
    }


    // return Customer ID
    int customerId() {
        System.out.println("Enter Customer ID : ");
        int id = sc.nextInt();
        return id;
    }

    // return Customer Name
    String customerName() {
        System.out.println("Enter Customer Name : ");
        String name = sc.next();
        return name;
    }

    // return Previous Meter Reading
    double previousReading() {
        System.out.println("Enter Previous Meter Reading : ");
        double previous = sc.nextDouble();
        return previous;
    }

    // return Current Meter Reading
    double currentReading() {
        System.out.println("Enter Current Meter Reading : ");
        double current = sc.nextDouble();
        return current;
    }

    // Units Consumed
    double unitsConsumed() {
        System.out.println("Enter Units Consumed : ");
        double units = sc.nextDouble();
        return units;
    }

    //Price Per Unit
    double pricePerUnit() {
        System.out.println("Enter Price Per Unit : ");
        double price = sc.nextDouble();
        return price;
    }


    // Fixed Charge
    double fixedCharge() {
        System.out.println("Enter Fixed Charge : ");
        double fixed = sc.nextDouble();
        return fixed;
    }


    //  Tax Amount
    double taxAmount() {
        System.out.println("Enter Tax Amount : ");
        double tax = sc.nextDouble();
        return tax;
    }


    //Discount Amount
    double discountAmount() {
        System.out.println("Enter Discount Amount : ");
        double discount = sc.nextDouble();
        return discount;
    }


    //Final Bill
    double finalBill() {
        System.out.println("Enter Final Electricity Bill : ");
        double bill = sc.nextDouble();
        return bill;
    }
}