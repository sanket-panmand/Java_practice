package com.neoSoft;

public class Find_MaxNumber {

	public static void main(String[] args) {
		
		int[] a = {10,20,2,41,52,10,4,112,6,2};
		int max =a[0];
		
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
				a[i]=max;
			}
		}
		System.out.println(max);
		
	}

}
