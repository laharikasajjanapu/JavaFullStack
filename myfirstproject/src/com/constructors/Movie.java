package com.constructors;

// copy constructor
public class Movie {
	
	String director;
	String producer;
	String hero;
	String heroine;
	String name;
	String budget;
	
	Movie(){
		
	}
	
	public Movie(String director,String producer){
		this.producer=producer;
		this.director=director;	
	}
	
	Movie(Movie m,String hero,String heroine){
		this.producer=m.producer;
		this.director=m.director;	
		this.hero=hero;
		this.heroine=heroine;
	}
	
	void display() {
		System.out.print(director +"   " +   producer);
	}

	public static void main(String[] args) {
		Movie m1=new Movie(" Ayan Mukherji","Karan Johar");
		m1.info();
		
		Movie m2=new Movie(m1,"Ranbir Kapoor","Alia Bhatt");
		m2.info();

	}
	
	void info() {
		System.out.println("Director of the movie : " + director);
		System.out.println("Producer of the movie : " + producer);
		System.out.println("Hero     of the movie : " + hero);
		System.out.println("Heroine  of the movie : " + heroine);
		System.out.println("Name     of the movie : " + name);
		System.out.println("Budget   of the movie : " + budget);
		System.out.println("------------------------------------------");
	}

}

class WebSeries extends Movie {
	
	WebSeries(String director,String producer){
		System.out.println("Webseries");
	}
	
	public static void main(String[] args) {
		WebSeries w1=new WebSeries("Ayan","Karan");
		Movie m1=new Movie("Ranbir Kapoor","Alia Bhatt");
		m1.display();
		w1.display();
	}
	
}
