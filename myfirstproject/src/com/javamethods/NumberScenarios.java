package com.javamethods;

public class NumberScenarios {

	public static void main(String[] args) {
		
		NumberScenarios n1=new NumberScenarios();
		n1.checkEven(10);
	}
	
	void checkEven(int number) {
		
		
		if(number%2==0) {
			System.out.println("Number is Even");
		}
		else if(number%2!=0) {
			System.out.println("Number");
		}
		else {
			System.out.println("Number is neither even not odd");
		}
	}

}
