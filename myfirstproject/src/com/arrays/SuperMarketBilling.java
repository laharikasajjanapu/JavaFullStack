package com.arrays;

public class SuperMarketBilling {

	public static void main(String[] args) {

		String[] products = { "BANANA", "GRAPES", "MANGO", "APPLES", "ORANGES" };
		int[] quantity = { 2, 1, 5, 3, 2 };
		double[] price = { 60.5, 150.0, 25.0, 40.0, 85.0 };

		double totalBill = 0;
		double sum_Price = 0;
		double avg_ItemPrice = 0;

		String highestProduct = "";
		String lowestProduct = "";

		double max = Integer.MIN_VALUE;
		double min = Integer.MAX_VALUE;

		for (int i = 0; i < products.length; i++) {
			double Bill_Amount = quantity[i] * price[i];
//			System.out.println(Bill_Amount);
			sum_Price = sum_Price + price[i];

			if (Bill_Amount > max) {
				max = Bill_Amount;
				highestProduct = products[i];
			}
			else if (Bill_Amount < min) {
				min = Bill_Amount;
				lowestProduct = products[i];
			}

			totalBill += Bill_Amount;
		}

		avg_ItemPrice = sum_Price / products.length;

		System.out.println("Total Bill Amount  : " + totalBill);
		System.out.println("Average Item Price : " + avg_ItemPrice);
		System.out.println("Highest Purchase Product = " + highestProduct + ":" + max);
		System.out.println("Lowest Purchase Product = " + lowestProduct + ":" + min);

	}

}
