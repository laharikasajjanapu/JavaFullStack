package com.languagefundamentals;
import java.util.Scanner;

public class JavaMethodsPractice {
	
	//Create a method to display customer details
	void customerDetails(int cid,String cname,int orderNumber,String address) {
		System.out.println("Customer ID    :  " + cid);
		System.out.println("Customer Name  :  " + cname);
		System.out.println("Order Number   :  "+ orderNumber);
		System.out.println("Address        :  "+ address);
	}
	void bookDetails(int bid,String bname,String author) {
		System.out.println("Book ID        :  " + bid);
		System.out.println("Book Name      :  " + bname);
		System.out.println("Author Name    :  "+ author);
		//System.out.println("Book Price     :  "+ price);
	}
	 

	public static void main(String[] args) {
		
		JavaMethodsPractice jm1=new JavaMethodsPractice();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter ID  :  ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name  :  ");
		String name=sc.nextLine();
		System.out.println("Enter Order Number");
		int onum=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Address :  ");
		String address=sc.nextLine();
		
		jm1.customerDetails(id, name, onum, address);
		jm1.bookDetails(id,name,address);
		
		sc.close();

	}

}
