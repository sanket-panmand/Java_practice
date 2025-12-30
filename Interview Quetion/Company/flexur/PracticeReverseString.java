package com.flexur;

public class PracticeReverseString {

	public static void main(String[] args) {
		
		String a ="sanket panmand";
		int len = a.length();
		String rev =" ";
		String[] b = a.split(" ");
		
		for(int i=b.length-1;i>=0;i--) {
			//rev+=a.charAt(i);
			System.out.print(b[i]+" ");
		}
		//System.out.println(rev);
		
	}

}

