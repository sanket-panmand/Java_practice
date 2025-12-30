package com.neoSoft;

public class Armstrom_no {

	public static void main(String[] args) {
		
		int num = 153;
		int temp = num;
		double result =0;
		
		while(num!=0) {
			int digit = num%10;
			num = num/10;
			result = result+Math.pow(digit, 3);
		}
		System.out.println(result==temp ? "arm":"non Arm");
	}

}
