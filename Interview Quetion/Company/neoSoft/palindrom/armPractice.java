package com.neoSoft.palindrom;

public class armPractice {

	public static void main(String[] args) {
		
		int num = 370;
		int temp = num;
		double result = 0;
		
		while(num !=0) {
			int digit = num%10;
			num = num/10;
			result = result +Math.pow(digit, 3);
		}
		System.out.println((result==temp )?"arm":"no arm");

	}

}
