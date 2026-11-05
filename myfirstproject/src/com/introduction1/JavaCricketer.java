package com.introduction1;

public class JavaCricketer {
	
	//instance variable declaration
	int jerseyNo;
	String cricketerName;
	int age;
	
	//static variables declaration
	static String countryName;
	static String boardName;
	
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("MAIN METHOD EXECUTED");
		countryName="India";
		boardName="BCCI";
		
		
		// Accessing the instance or non-static data by using object reference variable
		
		//First cricketer details
		
		JavaCricketer virat= new JavaCricketer();
		virat.jerseyNo=40;
		virat.cricketerName="Virat Kohili";
		virat.age=37;

		System.out.println("Jersey No       : "+virat.jerseyNo);
		System.out.println("Cricketer Name  : "+virat.cricketerName);
		System.out.println("Age             : "+virat.age);
		
		System.out.println("Country Name    : "+ countryName);
		System.out.println("Board Name      : "+ boardName);
		System.out.println("-----------------------------------------------");

		
		
		// Second cricketer details object reference variable
		
		JavaCricketer rohit= new JavaCricketer();
		rohit.jerseyNo=45;
		rohit.cricketerName="Rohit Sharma";
		rohit.age=39;

		System.out.println("Jersey No       : "+rohit.jerseyNo);
		System.out.println("Cricketer Name  : "+rohit.cricketerName);
		System.out.println("Age             : "+rohit.age);
		
		System.out.println("Country Name    : "+ countryName);
		System.out.println("Board Name      : "+ boardName);
		System.out.println("-----------------------------------------------");
		
		
		//Third cricketer details using object reference variable
		
		JavaCricketer gill= new JavaCricketer();
		gill.jerseyNo=77;
		gill.cricketerName="Shubman Gill";
		gill.age=27;

		System.out.println("Jersey No       : "+gill.jerseyNo);
		System.out.println("Cricketer Name  : "+gill.cricketerName);
		System.out.println("Age             : "+gill.age);
		
		System.out.println("Country Name    : "+ countryName);
		System.out.println("Board Name      : "+ boardName);
		System.out.println("-----------------------------------------------");

		//Fourth cricketer details using object reference variable
		
		JavaCricketer bumrah= new JavaCricketer();
		bumrah.jerseyNo=93;
		bumrah.cricketerName="Jasprit Bumrah";
		bumrah.age=32;

		System.out.println("Jersey No       : "+bumrah.jerseyNo);
		System.out.println("Cricketer Name  : "+bumrah.cricketerName);
		System.out.println("Age             : "+bumrah.age);
		
		System.out.println("Country Name    : "+ countryName);
		System.out.println("Board Name      : "+ boardName);
		System.out.println("-----------------------------------------------");

		//Fifth cricketer details using object reference variable
		
		
		JavaCricketer kl= new JavaCricketer();
		kl.jerseyNo=1;
		kl.cricketerName="KL Rahul";
		kl.age=34;

		System.out.println("Jersey No       : "+kl.jerseyNo);
		System.out.println("Cricketer Name  : "+kl.cricketerName);
		System.out.println("Age             : "+kl.age);
		
		System.out.println("Country Name    : "+ countryName);
		System.out.println("Board Name      : "+ boardName);
		
	}

}
