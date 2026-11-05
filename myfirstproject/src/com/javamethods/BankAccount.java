package com.javamethods;
import java.util.Scanner;

public class BankAccount {
	static Scanner sc=new Scanner(System.in);
	double balance;

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		System.out.println("Enter the balance  : ");
		b1.balance=sc.nextDouble();
		double checkBalance=b1.checkBalance();
		System.out.println("Bank Balance      :  "  + checkBalance);
		System.out.println("Current Balance   :  "  + b1.deposit());
		System.out.println("Current Balance   :  "  + b1.withdraw());
		System.out.println("Current Balance   :  "  + b1.bankInterest());
		double loanEMI=b1.loanEMI();
		System.out.println("Loan EMI          :  "  + loanEMI);
		double yearlyInterest=b1.yearlyInterest();
		System.out.println("Yearly Interest   :  " + yearlyInterest);
		double savingsAmount=b1.savingsAmount();
		System.out.println("Savings Amount    :  " + savingsAmount);
		double remainingLoan=b1.remainingLoan();
		System.out.println("Remaining  Loan   :  " + (loanEMI-remainingLoan));
		double serviceCharge=b1.serviceCharge();
		System.out.println("Service Charge    :  " + serviceCharge);
		
		System.out.println("Final Amount      :  " + (b1.balance+serviceCharge));
	}
	
	//Read account balance
	double checkBalance() {
		return balance;
	}
	
	//Calculate deposit amount
	double deposit() {
		System.out.println("Enter amount to deposit ");
		int amount=sc.nextInt();
		if(amount>=0) {
			balance=balance+amount;
			//return checkBalance();
		}
		else {
			System.out.println("Please enter valid Amount");
			//return checkBalance();
		}
		return checkBalance();
	}
	
	//Calculate withdrawal amount
	double withdraw() {
		System.out.println("Enter amount to withdraw ");
		int amount=sc.nextInt();
		if(amount<=balance) {
			balance=balance-amount;
			//return checkBalance();
		}
		else {
			System.out.println("Please enter valid Amount");
			//return checkBalance();
		}
		return checkBalance();
	}
	
	//Calculate bank interest
	double bankInterest() {
		System.out.println("Enter Rate of Interest  :  ");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter Time              :  ");
		int time=sc.nextInt();
		double interest=(balance*rateOfInterest*time)/100;
		balance=balance + interest;
		return balance;
	}
	
	//Calculate loan EMI
	double loanEMI() {
		System.out.println("Enter Loan Amount       : ");
		int loanAmount=sc.nextInt();
		System.out.println("Enter Rate of Interest  : ");
		int rateOfInterest=sc.nextInt();
		System.out.println("Enter Tenure in months  : ");
		int tenure=sc.nextInt();
		double EMI=(loanAmount + rateOfInterest +((1 + rateOfInterest)^tenure))/(((1+rateOfInterest)^tenure)-1);
		return EMI;
	}
	
	//Calculate yearly interest
	double yearlyInterest() {
		System.out.println("Enter Annual Rate      : ");
		int rate=sc.nextInt();
		double yearlyInterest=(balance*rate)/100; 
		return yearlyInterest;
	}
	
	//Calculate savings amount
	double savingsAmount() {
		System.out.println("Enter the Amount to balance : ");
		int amount=sc.nextInt();
		return balance+amount;
	}
	
	//Calculate remaining loan amount
	double remainingLoan() {
		System.out.println("Enter Principle Amount Repaid : ");
		int principlepaid=sc.nextInt();
		return principlepaid;
	}
	
	//Calculate service charge
	double serviceCharge() {
		System.out.println("Enter the service charge rate  : ");
		int chargesrate=sc.nextInt();
		return (balance*chargesrate)/100;
	}
	
	
	
	
}
