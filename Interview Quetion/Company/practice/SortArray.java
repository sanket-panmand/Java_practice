package com.practice;

public class SortArray {

	public static void main(String[] args) {
		
		int []a = {10,20,4,50,12,1,24,5};
		int []b = {15,16,10,45,98,10,9};
		
		int []c = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i+a.length]= b[i];
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
		for(int k: c)
		System.out.print(k+" ");

	}

}
