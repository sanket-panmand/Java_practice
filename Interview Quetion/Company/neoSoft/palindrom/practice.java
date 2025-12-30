package com.neoSoft.palindrom;

public class practice {

	public static void main(String[] args) {
		
		int a =12345;
		
		String str = Integer.toString(a);
		int len = str.length();
		
		String rev = "";
		
		System.out.print(a);
		for(int i= len-2;i>=0;i--){
			rev = rev + str.charAt(i);
		}
		System.out.print(rev);
	}

}
