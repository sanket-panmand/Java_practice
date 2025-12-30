package com.flexur;

public class maxNoPractice {

	public static void main(String[] args) {
		
		int[] a = {10,20,45,695,554,4};
		
		int max =0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		System.out.println(max+" ");

	}

}
