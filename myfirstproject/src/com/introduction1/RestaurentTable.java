package com.introduction1;

public class RestaurentTable {
	
	static String restaurentName="Amrutha";
	int tableNumber;
	int seats;
	boolean reserved;
	
	static void changeRestaurentName() {
		restaurentName="Vilas";
	}
	
	void reserveTable() {
		reserved=true;
		System.out.println("Table Reserved");
	}
	
	void cancelReservation() {
		reserved=false;
		System.out.println("Table Cancelled");
	}
	void displayTableDetails() {
		System.out.println("Table Number     :  " + tableNumber);
		System.out.println("seats            :  "+ seats);
		System.out.println("Reserved status  :  "+ reserved);
		System.out.println("Restaurent Name  :  " +restaurentName);
		
	}
	

	public static void main(String[] args) {
		RestaurentTable table1= new RestaurentTable();
		RestaurentTable table2= new RestaurentTable();
		
		changeRestaurentName();
		
		table1.tableNumber=101;
		table1.seats=4;
		table1.reserved=false;
		
		table2.tableNumber=102;
		table2.seats=5;
		table2.reserved=false;
		
		
		table1.displayTableDetails();
		table1.reserveTable();

		table2.cancelReservation();
		table2.displayTableDetails();

	}

}
