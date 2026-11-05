package com.javamethods;
import java.util.Scanner;

public class Calculations {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		Calculations c1=new Calculations();
		int square=c1.square();
		System.out.println("Square of given number : "+ square);
		double cube=c1.cube();
		System.out.println("Cube of given number   : " + cube);
		double areaOfCircle=c1.areaOfCircle();
		System.out.println("Area Of Circle  :  "+areaOfCircle);
		int areaOfRectangle=c1.areaOfRectangle();
		System.out.println("Area Of Rectangle  :  "+ areaOfRectangle + "cm\u00B2");
		double areaOfTriangle=c1.areaOfTriangle();
		System.out.println("Area Of Triangle  :  "+ areaOfTriangle);
		float perimeterOfRectangle=c1.perimeterOfRectangle();
		System.out.println("Perimeter of Rectangle  :  "+ perimeterOfRectangle);
		double circumference=c1.getCircumference();
		System.out.println("Circumference Of a Circle : " + circumference);
		double simpleInterest=c1.simpleInterest();
		System.out.println("Simple Interest  :  "+simpleInterest);
		double compundInterest=c1.compundInterest();
		System.out.println("Compound Interest  :  " + compundInterest);
		double percentage=c1.percentage();
		System.out.println("Percentage  :  "+ percentage);
		

	}
	// Find Square of a number
	int square() {
		System.out.println("Enter a number  : ");
		int num=sc.nextInt();
		return num*num;
	}
	
	//Find cube of number
	double cube() {
		System.out.println("Enter a number  :  ");
		double num=sc.nextDouble();
		return num*num*num;
	}
	
	//Calculate Area of a circle 
	double areaOfCircle() {
		System.out.println("Enter Radius  :  ");
		double radius=sc.nextDouble();
		return Math.PI*radius*radius; 
	}
	
	//Calculate Area of Rectangle
	int areaOfRectangle() {
		System.out.println("Enter Length  :  ");
		int length=sc.nextInt();
		System.out.println("Enter Breadth  :  ");
		int breadth=sc.nextInt();
		return length*breadth;
	}
	
	//Calculate Area Of Triangle
	double areaOfTriangle() {
		System.out.println("Enter base  : ");
		double base=sc.nextDouble();
		System.out.println("Enter height : ");
		double height=sc.nextDouble();
		return 0.5*base*height;
	}
	
	//Calculate Perimeter of a Rectangle
	float perimeterOfRectangle() {
		System.out.println("Enter Length : ");
		int length=sc.nextInt();
		System.out.println("Enter Width  :  ");
		int width=sc.nextInt();
		return 2*(length+width);
	}
	
	//Calculate the circumference of a circle
	double getCircumference() {
		System.out.println("Enter Radius  :  ");
		int radius=sc.nextInt();
		return 2*Math.PI*radius;
	}
	
	//Calculate simple interest
	double simpleInterest() {
		System.out.println("Enter Principal Amount :");
		int pAmount=sc.nextInt();
		System.out.println("Enter Rate of Interest  :");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter Time  :  ");
		int time=sc.nextInt();
		return (pAmount*rateOfInterest*time)/100;
	}
	
	//Calculate compound interest
	double compundInterest() {
		System.out.println("Enter Principal Amount :");
		int pAmount=sc.nextInt();
		System.out.println("Enter Rate of Interest  :");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter Time  :  ");
		int time=sc.nextInt();
		//If using percentage directly
		int amount=pAmount*(1+(rateOfInterest/100))^time;
		return amount-pAmount;
	}
	
	//Calculate Percentage
	double percentage() {
		System.out.println("Obtained Value  :  ");
		int obtainedValue=sc.nextInt();
		System.out.println("Total Value  :  ");
		int totalValue=sc.nextInt();
		return (obtainedValue/totalValue)*100;
	}

	
	
	
	
	
	
}
