package com.flexur;

public class ReverString{
	
	public static void main(String[] args) {
		/*
		// reverse word
		String s = "sanket panmand";
		 String[] a = s.split(" ");  //string into an array of words
		
		for(int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]+" ");
		}*/
		     
		// reverse string
		String ori = "this my laptop"; 
		String rev =" ";
		
		for(int i= ori.length() - 1; i>=0; i--) {
			rev= rev + ori.charAt(i); //method return  charater value
		}
		System.out.println(rev);
		
	}
}