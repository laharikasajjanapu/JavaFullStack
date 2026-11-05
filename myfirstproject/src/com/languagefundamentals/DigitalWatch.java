package com.languagefundamentals;
public class DigitalWatch {
	
	String brandName;
	String watchType;
	Integer hours;
	Integer minutes;
	Integer seconds;
	Integer price;
	
	void displayTime() {
		System.out.println("Time          : "+ hours +" : "+ minutes +" : "+ seconds);
		System.out.println("*******************************");
	}
	
	void displayWatchDetails() {
		
		System.out.println("Brand Name    :  " + brandName);
		System.out.println("Type Of Watch :  "+ watchType);
		System.out.println("Price         :  "+ price);
		
	}
	void updateHour() {
		hours=hours+1;
		System.out.println("---------Time is Updated!!!---------");
	}
	
	void updateMinutes() {
		minutes=minutes+1;
		//minutes+=1;
		//minutes++;
	}
	

	public static void main(String[] args) {
		DigitalWatch w1=new DigitalWatch();
		DigitalWatch w2=new DigitalWatch();
		
		w1.brandName="Rolex";
		w1.watchType="Analog";
		w1.price=1000;
		w1.hours=12;
		w1.minutes=34;
		w1.seconds=28;
		
		
		w1.displayWatchDetails();
		w1.updateHour();
		w1.updateMinutes();
		w1.displayTime();
		
		w2.brandName="Omega";
		w2.watchType="Digital";
		w2.price=1500;
		w2.hours=8;
		w2.minutes=20;
		w2.seconds=56;
		
		w2.displayWatchDetails();
		w2.updateHour();
		w2.updateMinutes();
		w2.displayTime();

	}

}
