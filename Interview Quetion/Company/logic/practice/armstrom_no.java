package com.logic.practice;

public class armstrom_no {

	public static void main(String[] args) {

		int number =153;
		int temp = number;
		int result = 0;
		
		while(number !=0) {
			int digit = number % 10; // 153 % 10 = 15.3consider only after decimal 3
			number = number / 10;  // 153 / 10 = 15.3consider only before decimal 15
			result = (int) (result + Math.pow(digit,3));//(3***3)(5***3)(1***3)
			
		}
		System.out.println(result == temp ?"Armstrom":"not Armstrom");
	}
 
}

