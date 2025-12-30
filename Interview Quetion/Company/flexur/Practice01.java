package com.flexur;

public class Practice01 {

	public static void main(String[] args) {
		
		int a;
		//System.out.println(number(3));
		
		int b = 3;
		int fact = 1;
		for(int i=1;i<=b;i++) {
			fact = fact * i;
		}
		System.out.print(fact);

	}

	/*
	public static int number(int a) {
		
		if(a==1 || a==0) {
			return 1; 
		}
		else {
			return a * number(a-1);
		}
	}*/
}
