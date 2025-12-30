package com.flexur;

public class pr1 {

	public static void main(String[] args) {
		
		int a[]= {2,4,5,1,3,6,8};
		int b[]= {10,4,5,78,10,2};
		
		int c[] = new int[a.length + b.length];
		
		for(int i= 0;i<a.length;i++) {
			c[i] = a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[i + a.length] = b[i];
		}
		
		
		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i] > c[j]){
				
					int temp = c[i];
					c[i] = c[j];
					c[j] = temp;
					
				}
			}
		}
		for(int k: c) {
			System.out.println(k);
		}
	}

}
