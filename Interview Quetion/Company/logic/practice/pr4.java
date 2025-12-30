package com.logic.practice;

public class pr4 {

	public static void main(String[] args) {
		
		String s = "sanket";
		
		String rev = "";
		
		System.out.print(s);
		for(int i=s.length()-2;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
		System.out.print(rev);

		System.out.println();
		
		String p = s+rev;
		
		String sc = new StringBuilder(p).reverse().toString();
		
		if(p.equals(sc)) {
		System.out.println("palindrom");
		}
		else {
			System.out.println("non palindrom");
		}
	}

}
