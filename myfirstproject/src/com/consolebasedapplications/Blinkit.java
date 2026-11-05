package com.consolebasedapplications;


import java.util.Scanner;

public class Blinkit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double totalPrice=0;
		double fruitsTotal=0;
		double vegTotal=0;
		String yn="";
		
		do {
			
			System.out.println("\n========= BLINKIT STORE =========");
			System.out.println("\nAvailable Categories:");
			System.out.println("1. Fruits");
			System.out.println("2. Vegetables");

			System.out.println("\nEnter your Category  :    ");
			String category=sc.next().toLowerCase();
			
			switch(category) {
			
			case "fruits"->{
				
				do {
					
					System.out.println("========= AVAILABLE FRUITS =========");
					System.out.println("Apple      - Rs.40/kg");
					System.out.println("Mango      - Rs.50/kg");
					System.out.println("Banana     - Rs.60/kg");
					System.out.println("Orange     - Rs.70/kg");
					System.out.println("Grapes     - Rs.80/kg");
					System.out.println("Watermelon - Rs.100/kg");
					System.out.println("\nEnter fruit name      :   ");
					String fruit=sc.next().toLowerCase();
					switch(fruit) {
					case "apple"->{
						fruitsTotal=fruitsTotal+40;
					}
					case "mango" -> {
						fruitsTotal=fruitsTotal+50;
					    
					}

					case "banana" -> {
						fruitsTotal=fruitsTotal+60;
					    
					}

					case "orange" -> {
						fruitsTotal=fruitsTotal+70;
					    
					}

					case "grapes" -> {
						fruitsTotal=fruitsTotal+80;
					    
					}

					case "watermelon" -> {
						fruitsTotal=fruitsTotal+100;
					   
					}
					default ->{
						System.out.println("\nEntered fruit is not Available");
					}
					
					}
					System.out.println("\nWould you like to add more fruits? (Y/N)");
					yn=sc.next();
					
				}while(yn.equalsIgnoreCase("Y"));
				
				System.out.println("\nTotal Cost Of Fruits is : " + fruitsTotal);
					
			}
			case "vegetables" ->{
				
				do {
					System.out.println("\nAvailable Vegetables:");
					System.out.println("Tomato - Rs.30/kg");
					System.out.println("Potato - Rs.40/kg");
					System.out.println("Onion - Rs.35/kg");
					System.out.println("Carrot - Rs.50/kg");
					System.out.println("Brinjal - Rs.45/kg");

					System.out.println("\nEnter vegetable name");
					String vegetable=sc.next().toLowerCase();
					switch(vegetable) {
					case "tomato" ->{
						vegTotal=vegTotal+30;
					}
					case "potato" -> {
					    vegTotal=vegTotal+40;
					}
					case "onion" -> {
					    vegTotal=vegTotal+35;
					}
					case "carrot" -> {
					    vegTotal=vegTotal+50;
					}
					case "brinjal" -> {
					    vegTotal=vegTotal+45;
					}
					default ->{
						System.out.println("Entered vegetable is not available ");
					}

					}
					
					System.out.println("\nWould you like to add more Vegetables ? (Y/N)");
					yn=sc.next();
				}while(yn.equalsIgnoreCase("Y"));
				
				System.out.println("\nTotal Cost of Vegetables: Rs." + vegTotal);
				
			}
			
			default ->{
				System.out.println("\nEntered category is not available");
			}
			}
			System.out.println("\nWould you like to continue shopping in another category? (Y/N)");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("Y"));
		
		totalPrice=fruitsTotal+vegTotal;
		System.out.println("\nTotal Amount Payable: Rs. " + totalPrice);
		System.out.println("\nExited from category");
		
		System.out.println("\n========= Final Bill =========");
		System.out.println(" Total Cost Of Fruits       :  "+ fruitsTotal);
		System.out.println(" Total Cost Of Vegetables   :  "+ vegTotal);
		System.out.println(" Total Bill                 :  "+ totalPrice);
		
		sc.close();
	}

}

