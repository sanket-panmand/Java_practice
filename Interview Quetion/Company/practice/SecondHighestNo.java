package com.practice;

public class SecondHighestNo {

	public static void main(String[] args) {
		
		int[] a = {10,20,40,80,75,12,15,55,60};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int k: a) {
			
			if(k > first) {
				second = first;
				first = k;
			}
			 else if(k != first && k > second){
				second =k;
			}
		}
		System.out.println(second);
	}

}
