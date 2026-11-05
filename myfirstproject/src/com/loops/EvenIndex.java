package com.loops;

public class EvenIndex {

	public static void main(String[] args) {
		int count=0;
		for(char ch='A';ch<='Z';ch++) {
			count=count+1;
			if(count%2==0) {
			System.out.println(ch);
			}
		}

	}

}
