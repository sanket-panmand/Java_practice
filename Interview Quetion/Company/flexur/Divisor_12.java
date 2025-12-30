package com.flexur;

public class Divisor_12 {

	public static void main(String[] args) {

		int count=0;

		int a=12;
		for(int i=1;i<=a/2;i++) {
			if(12 % i==0) {
				System.out.println(i+" ");
				count++;
			}
		}
		System.out.println("count is :"+count);

	}

}

