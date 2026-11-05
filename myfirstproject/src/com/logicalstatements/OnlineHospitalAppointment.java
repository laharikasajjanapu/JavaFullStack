package com.logicalstatements;

import java.util.Scanner;

public class OnlineHospitalAppointment {
	
	static Scanner sc=new Scanner(System.in);
	
	static void bookAppointment(int age) {
		if(age<0) {
			System.out.println("Invalid age");
		}
		else if(age>=18) {
			int patientType=patientType();
			if(patientType==1) {
				int availability=availability();
				if(availability==1) {
					System.out.println("Regular Appointment Confirmed");
				}
				else if(availability==2) {
					System.out.println("Please Check Another Slot");
				}
			}
			else if(patientType==2) {
				int availability=availability();
				if(availability==1) {
					System.out.println("Emergency Appointment Confirmed");
				}
				else if(availability==2) {
					System.out.println("Emergency Slot Not Available");
				}
			}
			else if(patientType!=1 | patientType!=2) {
				System.out.println("Invalid patient type");
			}
		}
	}
	static int patientType() {
		System.out.println("Choose 1 for Regular");
		System.out.println("Choose 1 for Emergency");
		System.out.println("Enter Patient Type : ");
		int patientType=sc.nextInt();
		return patientType;
	}
	
	static int availability() {
		System.out.println("Check for Availability");
		int availability=sc.nextInt();
		return availability;
	}

	public static void main(String[] args) {
		System.out.println("Enter your Age : ");
		int age=sc.nextInt();
		bookAppointment(age);
		
		sc.close();

	}

}
