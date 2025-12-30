package com.neoSoft;

import java.util.Scanner;

public class Find_nonPerfect_square {
	
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Entere any no : ");
		double number = sc.nextInt();
		
		double guess = number /2;
		
		double epsilon = 0.0001;
		
		for(int i =1;i<1000;i++) {
			guess = (guess + number / guess) / 2;
			
			if(Math.abs(guess * guess - number )<epsilon) {
				break;
			}
		}
		System.out.println(guess);
	}
}
