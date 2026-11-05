package com.constructors;

public class BankAccount {
	
	long accountNumber;
	String customerName;
	double balance;
	
	BankAccount(){
		System.out.println(accountNumber);
		System.out.println(customerName);
		System.out.println(balance);
		System.out.println("---------------------");
	}
	
	BankAccount(long accountNumber,String customerName,double balance){
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.balance=balance;
	}

	public static void main(String[] args) {
		BankAccount b1=new BankAccount();
		b1.accountNumber=1234567;
		b1.customerName="Rasagna";
		b1.balance=5000;
		System.out.println(b1.accountNumber);
		System.out.println(b1.customerName);
		System.out.println(b1.balance);
		System.out.println("---------------------");
		
		BankAccount b2=new BankAccount(987654,"Prasanna",10000);
		System.out.println(b2.accountNumber);
		System.out.println(b2.customerName);
		System.out.println(b2.balance);
	

	}

}
