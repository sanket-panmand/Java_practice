package com.neoSoft;

public class practiceSecondHighet {

	public static void main(String[] args) {
	
		int[] a = {1,12,5,8};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int no : a) {
			if(no>first) {
				second = first;
				first=no;
			}
			else if(no!=first && no>second) {
				second = no;
			}
		}
		System.out.println(second);

	}

}
