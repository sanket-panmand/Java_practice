package com.flexur;

public class practicesortarray {

	public static void main(String[] args) {
		
		int a[]= {1,5,3,4,2};
		int b[]= {11,25,13,24,02};
		
		int c[]= new int [a.length + b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length + i ] =b[i];
		}
		
		for(int i=0; i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					int temp = c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int k: c) {
			System.out.print(k + " ");
		}
		
	}

}
