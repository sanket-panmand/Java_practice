 package com.neoSoft;

public class Sort_Two_Array {

	public static void main(String[] args) {
		
		int[] a = {10,20,2,41,52,10,4,12,6,2};
		int[] b = {85,1,2,34,56,8,8,5,4,4};
		
		int[] c = new int[a.length+b.length];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
			c[a.length + i]=b[i];
		}

		for(int i=0;i<c.length;i++) {
			for(int j=i+1;j<c.length;j++) {
				if(c[i]>c[j]) {
					int temp =c[i];
					c[i]=c[j];
					c[j]=temp;
				}
			}
		}
		for(int k: c) {
			System.out.print(" "+k);
		}
	}

}
