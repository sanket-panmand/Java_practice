package com.neoSoft;

public class Word_reverse {

	public static void main(String[] args) {
		
		String s="sanket panmand";

		String[] a = s.split(" ");
		
		
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}

}
