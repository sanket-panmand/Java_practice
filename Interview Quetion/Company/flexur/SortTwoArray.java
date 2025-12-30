package com.flexur;

public class SortTwoArray {

	public static void main(String[] args) {
		
		int[] a= {5,9,2,6,7,8,7,1};
		int[] b= {12,19,12,16,27,58,17,01};
				
		int[] c= new int[a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]= a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length+i]= b[i];
			
		}
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				
			if(c[i]>c[j]) {
				int temp = c[i];
				c[i]=c[j];
				c[j]=temp;
			}
		}
	}
		for(int k : c) {
			System.out.print(k+" ");
		}
		

	}
}
