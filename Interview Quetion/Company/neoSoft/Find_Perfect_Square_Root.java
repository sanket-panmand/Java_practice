package com.neoSoft;

import java.util.Scanner;

public class Find_Perfect_Square_Root {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Perfetct Square : ");
		int a=sc.nextInt();
		
		
		for(int i=1;i<=a;i++) {
			if(i*i== a) {
				System.out.println("Perfect Square Root : " + i);
			}
		}
		
		}

}
