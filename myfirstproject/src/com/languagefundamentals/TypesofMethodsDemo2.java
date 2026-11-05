package com.languagefundamentals;
import java.util.Scanner;
public class TypesofMethodsDemo2 {
	
	//with Return type without parameters
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("main method started !!");

		TypesofMethodsDemo2 t1 = new TypesofMethodsDemo2();
		double salary = t1.employeeSalary();
		double bon = t1.empBonus();
		System.out.println("Total Salary is : " + (salary + bon));
		
		int sem1=t1.sem1();
		int sem2=t1.sem2();
		int sem3=t1.sem3();
		int sem4=t1.sem4();
		int sem5=t1.sem5();
		int sem6=t1.sem6();
		int sem7=t1.sem7();
		int sem8=t1.sem8();
		int total=(sem1+sem2+sem3+sem4+sem5+sem6+sem7+sem8);
		double avg=(double)total/8;
		System.out.println("Total Marks of Student  :  "+ total);
		
		//calculate student average marks
		System.out.println("Average of Marks        :  "+ avg);

		System.out.println("main method ended !!");
	}
	
	// Calculate Employee Salary + Bonus
	double employeeSalary() {
		System.out.println("Employee Salary is : ");
		double sal = sc.nextDouble();
		return sal;
	}

	double empBonus() {
		System.out.println("Enter Bonus :");
		double bonus = sc.nextDouble();
		return bonus;
	}
	
	//Calculate Students Marks total
	int sem1() {
		System.out.println("Enter first semister marks  : ");
		int sem1marks=sc.nextInt();
		return sem1marks;
	}
	int sem2() {
		System.out.println("Enter second semister marks  : ");
		int sem2marks=sc.nextInt();
		return sem2marks;
	}
	int sem3() {
		System.out.println("Enter third semister marks  : ");
		int sem3marks=sc.nextInt();
		return sem3marks;
	}
	int sem4() {
		System.out.println("Enter fourth semister marks  : ");
		int sem4marks=sc.nextInt();
		return sem4marks;
	}
	int sem5() {
		System.out.println("Enter fifth semister marks  : ");
		int sem5marks=sc.nextInt();
		return sem5marks;
	}
	int sem6() {
		System.out.println("Enter sixth semister marks  : ");
		int sem6marks=sc.nextInt();
		return sem6marks;
	}
	int sem7() {
		System.out.println("Enter seventh semister marks  : ");
		int sem7marks=sc.nextInt();
		return sem7marks;
	}
	int sem8() {
		System.out.println("Enter eigth semister marks  : ");
		int sem8marks=sc.nextInt();
		return sem8marks;
	}
	

}
