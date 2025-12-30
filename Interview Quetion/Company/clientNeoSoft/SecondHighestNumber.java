package com.clientNeoSoft;

public class SecondHighestNumber {

	public static void main(String[] args) {
		
		int a[] = {10,20,30,50,31};
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		
		
		for(int k: a) {
			if(k > first) {
				second = first;
				first = k;
			}
			else if(k != first && k > second) {
				second = k;
			}
		}
		System.out.println(second);
	}

}
