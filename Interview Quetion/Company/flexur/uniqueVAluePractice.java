package com.flexur;

public class uniqueVAluePractice {

	public static void main(String[] args) {

		int[] a = {10,2,07,8,9,4,5};
		
		int[] b = {65,45,12,24,3,85,75};
		
		int[] c =new int[a.length + b.length]; 
		
		for(int i =0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0; i<b.length;i++) {
			c[a.length + i] = b[i];
		}
		
		for(int i=0; i<c.length;i++) {
			for(int j =i+1; j<c.length;j++) {
				
				if(c[i]>c[j]) {
					
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
		for(int k: c) {
			System.out.print(k+" ");
		}

	}

}
