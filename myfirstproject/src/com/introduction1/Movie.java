package com.introduction1;

public class Movie {
	

	String movieName;
	int releasedYear;
	double ticketPrice;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// First movie details from movie list using object reference variable
		
		Movie movieName1=new Movie();
		movieName1.movieName="RRR";
		movieName1.releasedYear=2022;
		movieName1.ticketPrice=250;
		
		System.out.println("Movie Name     : " + movieName1.movieName);
		System.out.println("Released Year  : " + movieName1.releasedYear);
		System.out.println("Ticket Price   : " + movieName1.ticketPrice);
		System.out.println("----------------------------------------------------");
		
		// Second movie details from movie list using object reference variable
		
		Movie movieName2=new Movie();
		movieName2.movieName="Pushpa2";
		movieName2.releasedYear=2024;
		movieName2.ticketPrice=300;
		System.out.println("Movie Name     : " + movieName2.movieName);
		System.out.println("Released Year  : " + movieName2.releasedYear);
		System.out.println("Ticket Price   : " + movieName2.ticketPrice);
		System.out.println("----------------------------------------------------");
		
		// First movie details from movie list using object reference variable
		
		Movie movieName3=new Movie();
		movieName3.movieName="Kalki 2898 AD";
		movieName3.releasedYear=2024;
		movieName3.ticketPrice=350;
		System.out.println("Movie Name     : " + movieName3.movieName);
		System.out.println("Released Year  : " + movieName3.releasedYear);
		System.out.println("Ticket Price   : " + movieName3.ticketPrice);
		System.out.println("----------------------------------------------------");
		
	}

}
