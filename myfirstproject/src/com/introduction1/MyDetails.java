package com.introduction1;

public class MyDetails {
	
	String studentNo;
	String studentName;
	static String collegeName;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDetails st=new MyDetails();
		st.studentNo="22B41A05A6";
		st.studentName="Lahari";
		st.studentNo="22B41A05B9";
		st.studentName="Vennela";
		collegeName="KCEA";
		
		//Static data accessing using class and object
		
		System.out.println(st.studentNo);
		System.out.println(st.studentName);
		System.out.println(MyDetails.collegeName);
		//System.out.println(st.collegeName);
		
	

	}

}
