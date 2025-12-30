package com.flexur;

import java.util.Scanner;

public class ExceptionHandlingPr {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 : ");
		int a = sc.nextInt();
		System.out.println("Enter 2 : ");
		int b = sc.nextInt();
		
		
		
		try {
				int c = a/b;
				System.out.println(c);
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println("StringIndexOutOfBoundsException...................");
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException......................");
			System.out.println(e.getMessage());
		}
		catch(Throwable e) {
			System.out.println("Parent Exception.............");
			System.out.println(e.getMessage());
		}
	}

}
