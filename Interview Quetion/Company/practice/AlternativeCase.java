package com.practice;

public class AlternativeCase {

	public static void main(String[] args) {
		String str = "sanket";
		
		String result =" ";
		
		for(int i=0;i<str.length();i++) {
			
			char c = str.charAt(i);
			
			if(i % 2 == 0) {
				result += Character.toUpperCase(c);
			}
			else {
				result += Character.toLowerCase(c);
			}
		}
		System.out.println("original String :"+str);
		System.out.println("resultSet :"+ result);

	}

}
