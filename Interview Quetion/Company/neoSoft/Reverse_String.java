package com.neoSoft;

public class Reverse_String {

	public static void main(String[] args) {
	
		String name="sanket";
		
//		String sc = new StringBuilder(name).reverse().toString();
//		System.out.println(sc);

		String rev =" ";
		int len = name.length();
		
		for(int i=len-1;i>=0;i--) {
			rev = rev+name.charAt(i);
		}
		System.out.println(rev);
	}

}
