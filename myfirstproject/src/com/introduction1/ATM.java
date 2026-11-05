package com.introduction1;

public class ATM {
	
	static String bankName="HDFC";
	long accountNumber;
	double balance;
	double deposit;
	double withdraw;
	
	
	void deposit() {
		balance=balance+deposit;
	}
	
	void withdraw() {
		balance=balance-withdraw;
	}
	
	void checkBalance() {
		System.out.println("Balance   :   "+ balance);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM account1=new ATM();
		ATM account2=new ATM();
		account1.accountNumber=23456789;
		account1.balance=3000;
		account1.deposit=2000;
		account1.withdraw=1000;
		
		account2.accountNumber=987654322;
		account2.balance=4000;
		account2.deposit=0;
		account2.withdraw=1000;
		
		account1.deposit();
		account1.withdraw();
		account1.checkBalance();
		
		account2.deposit();
		account2.withdraw();
		account2.checkBalance();
		


	}

}
