package com.loops;

public class Numbers {

	public static void main(String[] args) {
		int i=1;
		int num=numbers(i);
		System.out.println(num);
	}
	static int numbers(int i){
		if(i==100) {
			return i;
		}
		else {
			System.out.println(i);
		}
		return numbers(i+1);
	}

}
