package com.neoSoft;

public class Fibonacci_Series {

	public static void main(String[] args) {
		
		int a=1;
		int b=2;
		
		System.out.print(a+" "+b);
		for(int i=1;i<=5;i++) {
		int	c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}

	}

}
