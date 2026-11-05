package com.languagefundamentals;

public class LoanManagement {
	String customerName="Java \"is\" Fun";
	double loanAmount;
	int interestRate;
	int loanTenure;
	double interest;
	double totalAmount;
	double emi;

	public static void main(String[] args) {
		LoanManagement lm1=new LoanManagement();
		lm1.customerName="Laharika";
		lm1.loanAmount=10000;
		lm1.interestRate=4;
		lm1.loanTenure=2;
		lm1.calculateInterest();
		lm1.calculateTotalAmount();
		lm1.calculateMonthlyEMI();
		lm1.displayLoanSummary();

		LoanManagement lm2=new LoanManagement();
		lm2.customerName="Vennela";
		lm2.loanAmount=20000;
		lm2.interestRate=3;
		lm2.loanTenure=3;
		lm2.calculateInterest();
		lm2.calculateTotalAmount();
		lm2.calculateMonthlyEMI();
		lm2.displayLoanSummary();

	}
	
	double calculateInterest() {
		interest=(loanAmount*interestRate)/100;
		return interest;
	}
	
	double calculateTotalAmount() {
		totalAmount=loanAmount+interest;
		return totalAmount;
	}
	
	double calculateMonthlyEMI() {
		emi= totalAmount/(loanTenure*12);
		return emi;
	
	}
	
	void displayLoanSummary() {
		System.out.println("Customer  Name   :  " + customerName);
		System.out.println("Loan Amount      :  " + loanAmount);
		System.out.println("Interest Rate    :  " + interestRate);
		System.out.println("Loan Tenure      :  " + loanTenure);
		System.out.println("Interest         :  " + interest);
		System.out.println("Total Amount     :  " + totalAmount);
		System.out.println("Monthly EMI      :  " + emi);
		
	}

}
