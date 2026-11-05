package com.languagefundamentals;

import java.util.Scanner;

public class BankAccount {
	static Scanner sc = new Scanner(System.in);
	long accountNumber;
	String customerName;
	double balance;

	double deposit(double amount) {
		balance = balance + amount;
		return balance;
	}

	double withdraw() {
		System.out.println("Enter amount to withdraw   :  ");
		double amount = sc.nextDouble();
		balance = balance - amount;
		return balance;
	}

	double transfer(BankAccount account, double amount) {
		balance = balance - amount;
		account.balance = account.balance + amount;
		return account.balance;
	}

	double calculateInterest() {
		System.out.println("Enter Interest Rate        :  ");
		double interestRate = sc.nextInt();
		double amount = (balance * interestRate) / 100;
		return balance + amount;
	}

	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();
		System.out.println("Enter Account Number      :   ");
		b1.accountNumber = sc.nextLong();
		System.out.println("Enter Customer Name       :   ");
		sc.nextLine();
		b1.customerName = sc.nextLine();
		System.out.println("Enter the balance         :   ");
		b1.balance = sc.nextDouble();
		System.out.println("Deposited  Amount         :  " + b1.deposit(2000));
		System.out.println("Withdrawn Amount          :  " + b1.withdraw());
		System.out.println("Calculated Interest       :  " + b1.calculateInterest());
		System.out.println("Initial Balance           :  " + b1.balance);

		BankAccount b2 = new BankAccount();
		b2.accountNumber = 1002;
		b2.customerName = "Rahul";
		b2.balance = 5000;
		
		System.out.println("Enter Transfer Amount     :  ");
		double transferAmount=sc.nextDouble();
		System.out.println("b2 balance after tranfer  :  "  +  b1.transfer(b2, transferAmount));
		System.out.println("b1 balance after transfer :  "  +  b1.balance);
		

	}

}
