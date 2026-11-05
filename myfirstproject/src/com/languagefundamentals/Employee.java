package com.languagefundamentals;

//Types of variables

public class Employee {
	
	// ------Instance  Variables------
	
	//primitive + instance
	int emp_id;
	
	//Object + instance
	String emp_name;
	
	//--------Static Variables---------
	
	//primitive + static 
	static int org_id=105;
	
	
	
	//Object + static
	static String org_name="VSS";

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		int org_id=103;
		String org_name="VCUBE";
		
		System.out.println(org_id); // 103
		System.out.println(org_name); //VCUBE
		
		System.out.println("-------------------------");
		
		Employee e1=new Employee();
		// initialization of instance variables
		
		e1.emp_id=121;
		e1.emp_name="Laharika";
		
		//--------Local Variables-----------
		
		//primitive + Local
		int age;
		
		//Object + Local
		String city;
		
		//Accessing Local Variables
		//The local variable "age" may not have been initialized
		//We cannot access the local data without initialization
		age=22;
		city="Hyderabad";
		System.out.println(age);
		System.out.println(city);
		
		System.out.println("--------------------------");
		
		//Accessing the static data
		
		System.out.println("Acessing the static data directly");
		//Accessing the static data is possible only within the class
		System.out.println(org_id);
		System.out.println(org_name);
		
		//Whenever we want to access the static data outside the classes ,then we use class name
		//The recommended approach to call static data is by using class name
		System.out.println("Accessing the static data using class name");
		System.out.println(Employee.org_id);
		System.out.println(Employee.org_name);
		
		//Whenever we want to access the static data using object reference variable
		//Warning : The static field Employee.org_id should be accessed in a static way
		System.out.println("Accessing te static data using object reference variable");
		System.out.println(e1.org_id);
		System.out.println(e1.org_name);
		
		//Accessing the Instance data
		
		//For instance data ,we can access only through the object reference variable
		//Accessing the data using object reference variable
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_name);
		
		Employee e2=null;
		//Even though e2 is null static data is loading
		//so there is no impact to call static data by using object reference variable
		//The recommended approach to call static data is by using class name
		System.out.println(e2.org_id);
		System.out.println(e2.org_name);
		
//		System.out.println(e2.emp_id);// Null Pointer Exception
//		System.out.println(e2.emp_name);// Null Pointer Exception
		
		System.out.println("Main Method Ended");
		

	}

}
