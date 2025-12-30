package com.logic.practice;

public class NoPalindrom {

	public static void main(String [] args)
	{
		int a =121;
	    String s = Integer.toString(a);
		
		String sc = new StringBuilder(s).reverse().toString();
		
		if(s.equals(sc)) {
			System.out.println("Palindrom");
		}
		else {
			System.out.println("Non-Palindrom");
		}
        
	}
}
    
