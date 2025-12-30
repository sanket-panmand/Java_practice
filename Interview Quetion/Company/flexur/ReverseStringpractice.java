package com.flexur;

public class ReverseStringpractice {

	public static void main(String[] args) {
		
		String ori = "sanket panmand";
		
		int len = ori.length();
		
		String rev =" ";
		
		for(int i=len-1;i>=0;i--) {
			rev = rev + ori.charAt(i);
		}
		System.out.println(rev);
	}

}
