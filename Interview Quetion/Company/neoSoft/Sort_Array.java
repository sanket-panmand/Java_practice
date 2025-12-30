package com.neoSoft;

public class Sort_Array {

	public static void main(String[] args) {
		
		int[] a = {10,20,4,5,65,1,32,5};
		
		for(int i=0;i<=a.length-1;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]> a[j]) {
					int temp =a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(int k:a) {
		System.out.print(" "+k);
		}
	}

}
