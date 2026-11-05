package com.introduction1;

public class Task1 {
	
	static int total=100;
	static int pen=7;
	int remaining_cost;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int totalcost_for_pens;
		Task1 t=new Task1();
		
		totalcost_for_pens=total/pen;
		System.out.println(totalcost_for_pens);
		t.remaining_cost=total%pen;
		System.out.println(t.remaining_cost);
	}

}
