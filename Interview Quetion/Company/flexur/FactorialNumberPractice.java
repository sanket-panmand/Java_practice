package com.flexur;

public class FactorialNumberPractice {

	public static void main(String[] args) {
		
		System.out.print("F.N :" + number(10));
	}
	
	static int number(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*number(n-1);
		}
	}
	static void factorial() {
		int no=3;
		int fact=1;
		for(int i=1;i<=no;i++) {
			 
			fact = fact * i;
			}
		System.out.println(fact);
	}

}
