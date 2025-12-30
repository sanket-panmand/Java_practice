package com.flexur;

import java.util.Scanner;

public class PrimeNumber{
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the any number: ");
		int number = sc.nextInt();
		int temp =0;
		
		for(int i = 2; i<=number-1;i++) {
			if(number % i ==0) {
				temp = temp+1;
			}
		}
		if(temp==0) {
			System.out.println(number+" It is prime number");
		}
		else
		{
			System.out.println(number+" It is not-prime number");
		}
	}
}