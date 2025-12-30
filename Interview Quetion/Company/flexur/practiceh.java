package com.flexur;

public class practiceh {

	public static void main(String[] args) {
		
		int a[]= {10,20,45,100,121,12};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		
		
		for(int k : a) {
			
			if(k > first) {
				second = first;
				first = k;
			}else if(k != second && second < k) {
				second = k;
			}
		}
 
		System.out.println(second);
	}

}
