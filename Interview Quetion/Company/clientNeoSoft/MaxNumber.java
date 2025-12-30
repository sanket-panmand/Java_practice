package com.clientNeoSoft;

public class MaxNumber {

	public static void main(String[] args) {
		
		int[] a = {10,20,54,12,58,42};
		
		int max =0;
		
	for(int i=0;i<a.length;i++) {
		if(a[i]> max) {
			max = a[i];
		}
	}
	System.out.println(max);
		
	}

}
