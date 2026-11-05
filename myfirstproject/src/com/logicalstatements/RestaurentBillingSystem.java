package com.logicalstatements;

import java.util.Scanner;

public class RestaurentBillingSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double totalPrice=0;
		double starterPrice=0;
		double dessertPrice=0;
		double mainCoursePrice=0;
		String yn="";
		do {
			
			System.out.println("\n========= RESTAURANT MENU =========");
            System.out.println("Available Categories:");
            System.out.println("1. Starters");
            System.out.println("2. Main Course");
            System.out.println("3. Desserts");
            
			System.out.println("\nEnter Category :  ");
			String cat=sc.next().toLowerCase();
			switch(cat) {
			case "starters"->{
				
				do {
				System.out.println("\n--------- STARTERS ---------");
                System.out.println("Paneer Tikka - Rs.180");
                System.out.println("Chicken 65   - Rs.220");
                System.out.println("Manchurian   - Rs.150");

                System.out.println("\nEnter starter name:");
                String starter = sc.next().toLowerCase();
                switch(starter) {
                case "paneertikka"->{
                	starterPrice=starterPrice+180;	
                }
                case "chicken65"->{
                	starterPrice=starterPrice+220;
                }
                case "manchurian"->{
                	starterPrice=starterPrice+150;
                }
                default-> System.out.println("Entered Item is not available");
                }
                System.out.println("\nWould like to add starters ? (Y/N)");
                yn=sc.next();
                
			}while(yn.equalsIgnoreCase("Y"));
			System.out.println("Cost of Starters  :  " + starterPrice);
			
			}
			case "desserts"->{
				
				do {
					System.out.println("\n--------- DESSERTS ---------");
	                System.out.println("Ice Cream - Rs.100");
	                System.out.println("Gulab Jamun - Rs.120");
	                System.out.println("Brownie - Rs.150");

	                System.out.println("\nEnter dessert name:");
	                String dessert = sc.next().toLowerCase();
	                switch(dessert) {
	                case "icecream"->{
	                	dessertPrice=dessertPrice+100;
	                }
	                case "gulabjamun"->{
	                	dessertPrice=dessertPrice+120;
	                }
	                case "brownie"->{
	                	dessertPrice=dessertPrice+150;
	                }
	                default->System.out.println("Entered Item is not Available");
	                }
	                System.out.println("\nWould you like to add desserts? (Y?N)");
	                yn=sc.next();
				}while(yn.equalsIgnoreCase("Y"));
					
				}
			case "main course"->{
				
				do {
					 System.out.println("\n--------- MAIN COURSE ---------");
		             System.out.println("Biryani - Rs.250");
		             System.out.println("Fried Rice - Rs.180");
		             System.out.println("Noodles - Rs.160");

		             System.out.println("\nEnter main course name:");
		             String mainCourse = sc.next().trim().toLowerCase();
		             switch(mainCourse) {
		             case "chickenbiryani"->{
		            	 mainCoursePrice=mainCoursePrice+250;
		             }
		             case "friedrice"->{
		            	 mainCoursePrice=mainCoursePrice+180;
		             }
		             case "noodles"->{
		            	 mainCoursePrice=mainCoursePrice+160;
		             }
		             default-> System.out.println("Entered Item is not Available");
		             }
		             System.out.println("\nWould you like to add items? (Y/N)");
		             yn=sc.next();
					
				}while(yn.equalsIgnoreCase(yn));
				System.out.println("Cost of Main Courses  : " + mainCoursePrice);
				
			}
			
			default->System.out.println("Entered Category is not Available");
			}
			
			System.out.println("\nWould you like to continue with Category ? (Y/N)");
			yn=sc.next();
			
		}while(yn.equalsIgnoreCase("Y"));
		
		totalPrice=starterPrice+dessertPrice+mainCoursePrice;
		
		System.out.println("\n========= FINAL BILL =========");
        System.out.println("Total Food Cost      : Rs. " + totalPrice);
        System.out.println("Total Amount Payable : Rs. " + totalPrice);
        System.out.println("\nThank you for dining with us!");
        System.out.println("\nWe hope to serve you again.");

		
		sc.close();

	}

}
