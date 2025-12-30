package com.logic.practice;

public class pr1 {

	public static void main(String[] args) {
		
		int n = 123221;
		
		String s = Integer.toString(n);
		
		String sc = new StringBuilder(s).reverse().toString();
		
		if(s.equals(sc)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("non palindrom");
		}

	}

}
