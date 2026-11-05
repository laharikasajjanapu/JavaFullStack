package com.constructors;

public class MobilePhone {
	
	String brand;
	String model;
	double price;
	int ram;
	
	MobilePhone(){
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(ram);
		System.out.println("-----------------------");
		
	}
	
	MobilePhone(String brand,String model,double price,int ram){
		this.brand=brand;
		this.model=model;
		this.price=price;
		this.ram=ram;
	}

	public static void main(String[] args) {
		MobilePhone m1=new MobilePhone();
		m1.brand = "Samsung";
		m1.model = "Galaxy S24";
		m1.price = 74999.99;
		m1.ram = 8;
		
		m1.display();
		
//		System.out.println(m1.brand);
//		System.out.println(m1.model);
//		System.out.println(m1.price);
//		System.out.println(m1.ram);
//		System.out.println("-----------------------");
		
		MobilePhone m2=new MobilePhone("Apple","iPhone 15",69999.00,6);
		m2.display();
//		System.out.println(m2.brand);
//		System.out.println(m2.model);
//		System.out.println(m2.price);
//		System.out.println(m2.ram);

	}
	
	void display() {
		System.out.println(brand);
		System.out.println(model);
		System.out.println(price);
		System.out.println(ram);
		System.out.println("-----------------------");
		
	}

}
