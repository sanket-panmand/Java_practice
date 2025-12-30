package com.logic.practice;

public class pr3 {

	public static void main(String[] args) {
	
		String s = "madadm";
		
		String sc = new StringBuilder(s).reverse().toString();
		
		if(s.equals(sc)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("non palindrom");
		}
	}

}
