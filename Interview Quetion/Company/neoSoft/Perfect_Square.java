package com.neoSoft;

import java.util.Scanner;

public class Perfect_Square {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int a = sc.nextInt();
		
		for(int i=1;i<=a;i++) {
			if(i*i==a) {
				System.out.print("Square root is  :" + i);		
			}
		}	
		
	}

}
