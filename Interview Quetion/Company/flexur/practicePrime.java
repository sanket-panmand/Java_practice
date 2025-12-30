package com.flexur;

public class practicePrime {

	public static void main(String[] args) {
		
		int a =5;
		int temp = 0;
		for(int i=2;i<=a-1;i++) {
			if(a%i==0) {
			
				temp = temp +1;
			}
		}
		if(temp == 0) {
			System.out.println("prime");
		}
		else {
			System.out.println("No Prime");
		}

	}

}
