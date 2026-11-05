package com.accessmodifiers01;

public class BankAccount {

	private String accountHolderName;
	private long balance;
	private String city;
	private long accountNumber;
	
	public void setCity(String city) {
		this.city=city;
	}
	
	public void setaccountNumber(long accountNumber) {
		this.accountNumber=accountNumber;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public long getBalance() {
		return balance;
	}
	
	public String getCity() {
		return city;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}

	public static void main(String[] args) {

		BankAccount ac1 = new BankAccount();
		
		ac1.setAccountHolderName("Laharika");
		ac1.setBalance(10000);
		ac1.setCity("Hyd");
		ac1.setaccountNumber(1237778996);

		System.out.println("Account Holder Name : "  + ac1.getAccountHolderName());
		System.out.println("Balance             : "  + ac1.getBalance());
		System.out.println("City                : "  + ac1.getCity());
		System.out.println("Account Number      : "  + ac1.getAccountNumber());

	}

}
