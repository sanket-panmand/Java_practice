package com.logic.practice;

public class larget_element {

	public static void main(String[] args) {
		
		int a[]= {10,20,45,1,0,54,0,5,98,5,48,1,58,8,8};
		int max =a[0];
		
		for(Integer arr :a) {
			if(arr > max) {
				max=arr;
			}
		}
		System.out.println(max);
	}

}
