package com.loops;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the connection Type");
		int rate=0;
		int charges=0;
		int units=0;
		String connectionType=sc.next();
		switch(connectionType) {
		case "domestic"->{
			System.out.println("Enter the number of units consumed");
			units=sc.nextInt();
			if(units<=100) {
				rate=2;
				charges=units*rate;
			}
			else if(units>300) {
				rate=3;
				charges=units*rate;
			}
		}
		
		case "commercial"->{
			System.out.println("Enter the number of units consumed");
			units=sc.nextInt();
			if(units<=100) {
				charges=units*4;
			}
			else if(units>100 && units<=300) {
				charges=units*6;
			}
			else if(units>300) {
				units=units*8;
			}
		}
		default->System.out.println("Entered Connection Type is Invalid");
		}
		System.out.println("Connection Type : " +connectionType);
		System.out.println("Units Conumed   : "+ units);
		System.out.println("Rate per Unit   : "+ rate);
		System.out.println("Total Electricity Bill: "+ charges);
		sc.close();

	}
}
