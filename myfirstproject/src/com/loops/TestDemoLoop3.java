package com.loops;
// check prime
import java.util.Scanner;

public class TestDemoLoop3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter input number");
		int n=sc.nextInt();
		
		boolean status=isPrime(n);
		
		if(status) {
			System.out.println("Prime ");
		}
		else {
			System.out.println("Not Prime");
		}
		
		boolean result=isPrimeNUmber(n);
		System.out.println("Given number is " + result);

		
		sc.close();

	}
	
	static boolean isPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		
		if(count==2) {
			return true;
		}
		
		return false;
	}
	
	static boolean isPrimeNUmber(int n) {
		boolean status=true;
		if(n==0 | n==1) {
			return false;
		}
		
		if(n%2==0) {
			return false;
		}
		
		return status;
	}
	
	
}
