package com.consolebasedapplications;

import java.util.Scanner;

public class NaukriEligibilityPortal {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Good morning! Welcome to the interview. May I know your name?");
		String name=sc.nextLine();
		//System.out.println("My Name is " + name);
		
		System.out.println("Nice to meet you. What is your highest qualification? (BTech/MTech/MCA/etc.)");
		String highestQualification=sc.nextLine();
		
		if(highestQualification.equalsIgnoreCase("B.Tech") || highestQualification.equalsIgnoreCase("M.Tech") || 
		highestQualification.equalsIgnoreCase("MCA")) {
			System.out.println("Your educational qualification meets our requirements. You can proceed.");
			System.out.println("What is your CGPA or percentage ? ");
			double cgpa=sc.nextDouble();
			//System.out.println("My CGPA is : " + cgpa);
			
			if(cgpa >= 6.5) {
				System.out.println("Your CGPA satisfies our eligibility criteria");
				System.out.println("Are you a fresher, or do you have previous work experience?");
				int experience=sc.nextInt();
				
				if (experience >=0 && experience <=2) {
				    System.out.println("You meet the experience eligibility criteria.");
				    System.out.println("Do you have knowledge of Java and SQL required for this position");
				    sc.nextLine();
				    String skills=sc.nextLine();
				    
				    if(skills.equalsIgnoreCase("Java") || skills.equalsIgnoreCase("SQL") ) {
				    	System.out.println("You have the required technical skills. Let's continue.");
				    	System.out.println("May I Know your Current Location ");
				    	String location=sc.nextLine();
				    	System.out.println("Yes. My current Location is " + location );
				    	
				    	if(location.equalsIgnoreCase("Banglore")) {
				    		System.out.println("Your location matches the job location. You can proceed.");	
				    		System.out.println("What is your expected salary?");
			    			double expected_Salary=sc.nextDouble();
			    			double companyBudget=6;
			    			
			    			if(expected_Salary < companyBudget) {
			    				System.out.println("Your salary expectation is within our budget.");
			    			    System.out.println("Finally, what is your notice period or how soon can you join?");
			    			    int noticePeriod=sc.nextInt();
			    			    System.out.println("I can join within " + noticePeriod +"days");
			    			        	
			    			    if(noticePeriod<=30) {
			    			    	System.out.println("Congratulations! You have successfully completed the eligibility process.");
			    			    }   	
			    			    else {
			    			    	System.out.println("You have been selected, but your joining availability needs to be discussed");
			    			    }
			    			}         
			    			else {
			    				 System.out.println("We may need to discuss the salary package further.");
			    			}
				    	}
				    	else {
				    		System.out.println("Would you be willing to relocate?");
				    		boolean relocate = sc.nextBoolean();

				    		if (relocate) {
				    			System.out.println("You are willing to relocate. You can proceed.");
				    			        
				    			System.out.println("What is your expected salary?");
				    			double expected_Salary=sc.nextDouble();
				    			double companyBudget=6;
				    			
				    			if(expected_Salary < companyBudget) {
				    				System.out.println("Your salary expectation is within our budget.");
				    			    System.out.println("Finally, what is your notice period or how soon can you join?");
				    			    int noticePeriod=sc.nextInt();
				    			    System.out.println("I can join within " + noticePeriod +"days");
				    			        	
				    			    if(noticePeriod<=30) {
				    			    	System.out.println("Congratulations! You have successfully completed the eligibility process.");
				    			    }   	
				    			    else {
				    			    	System.out.println("You have been selected, but your joining availability needs to be discussed");
				    			    }
				    			}         
				    			else {
				    				 System.out.println("We may need to discuss the salary package further.");
				    			}
				    		}
				    		else {
				    			System.out.println("Your location is not matched !!!");
				    		}
				       }		
				    }
				    
				    else {
				    	System.out.println("You need to improve technical skills");
				    }
				}
				
				else {
					System.out.println("We will check whether there are suitable opportunities available for you.");
				}
				
			}	
			else {
				System.out.println("Unfortunately, you do not meet our educational eligibility criteria");
			}	
		}
		else {
			System.out.println("You qualification is not supported ");
		}
		sc.close();

	}
}

