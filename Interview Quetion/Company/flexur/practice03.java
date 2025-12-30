package com.flexur;

public class practice03 {

	public static void main(String[] args) {
		
		String ori = "sanket namdev panmand";
		
		ori = ori.trim();
		String[] b = ori.split(" ");// String is convert into array
		
	
		
		for(int i=b.length-1;i>=0;i--) {
			//rev = rev + ori.charAt(i);
			System.out.print(b[i]+ " ");
		}
		
	}


}
