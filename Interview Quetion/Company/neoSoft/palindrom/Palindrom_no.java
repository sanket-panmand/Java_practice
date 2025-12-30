 package com.neoSoft.palindrom;

public class Palindrom_no {

	public static void main(String[] args) {
		
		int a= 123454321;
		String s = Integer.toString(a);
		
		String sc = new StringBuilder(s).reverse().toString();
		
		System.out.println((s.equals(sc))?"Palindrom "+s:"non palindrom");
		
		////////////////////////////////////////
		
		String name="madam";
		String rev = new StringBuilder(name).reverse().toString();
		
		System.out.println((name.equals(rev))?"Palindrom "+name:"non palindrom"+name);
	}

}
