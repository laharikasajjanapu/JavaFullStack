package com.languagefundamentals;

public class VandeExpress {

	String passengerName;
	Integer age;
	String source;
	String destination;
	Integer numberofTickets = 0;
	static Integer totalTicketsBought = 0;
	static Integer totalAmountCollected=0;
	static Integer totalAmount = 0;
	static int price = 500;

	static {
		System.out.println("Welcome to Vande Express thank you for choosing us");
	}

	void bookTicket() {
		totalTicketsBought = totalTicketsBought + numberofTickets; // 0+10
		// int x=price*numberofTickets; //10*500
		totalAmount += price * numberofTickets;
		totalAmountCollected+=totalAmount;
		System.out.println("Ticket is booked successfully");
	}

	void displayBookingDetails() {
		System.out.println("Passenger Name      : " + passengerName);
		System.out.println("Passenger Age       : " + age);
		System.out.println("Number of Tickets   : " + numberofTickets);
		System.out.println("Total Amount        : " + totalAmount);

	}

	static void ticketCounter() {
		System.out.println("Total Tickets booked by all passengers  : " + totalTicketsBought);
		System.out.println("Total Amount :  " + totalAmountCollected);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VandeExpress passenger1 = new VandeExpress();
		VandeExpress passenger2 = new VandeExpress();

		passenger1.passengerName = "Laharika";
		passenger1.numberofTickets = 10;
		passenger1.age = 20;
		passenger1.bookTicket();
		passenger1.displayBookingDetails();

		passenger2.passengerName = "Vennela";
		passenger2.numberofTickets = 3;
		passenger2.age = 20;
		passenger2.bookTicket();
		passenger2.displayBookingDetails();

		ticketCounter();
	}

}
