package com.introduction1;

public class MovieTicket {
	
	int ticketId;
	String movieName;
	int seatNumber;
	boolean booked;
	static String theatreName="Sai Krishna";
	
	void bookTicket() {
		booked=true;
		System.out.println("Ticket is booked");
	}
	
	void cancelTicket() {
		booked=false;
		System.out.println("Ticket is Cancelled");
	}
	void displayticketDetails() {
		System.out.println("Movie Name :  "+ movieName);
		System.out.println("Seat Number : "+ seatNumber);
		System.out.println("Booking Status  : "+ booked);
		System.out.println("Theatre Name  :  "+ theatreName);
	}
	static void changeTheatreName() {
		theatreName="Laxmi";
	}
	void displayTheatreName() {
		System.out.println("Theatre Name :  " + theatreName);
	}

	public static void main(String[] args) {
		MovieTicket t1=new MovieTicket();
		MovieTicket t2=new MovieTicket();
		
		t1.movieName="Chennai love story";
		t1.seatNumber=203;
		t1.booked=false;

		
		t2.movieName="Spiderman";
		t2.seatNumber=206;
		t2.booked=true;
		
		changeTheatreName();
		
		t1.bookTicket();
		t1.displayticketDetails();
		System.out.println("-----------------------------------------------------------");
		t2.cancelTicket();
		t2.displayticketDetails();
		
		
		
		

	}

}
