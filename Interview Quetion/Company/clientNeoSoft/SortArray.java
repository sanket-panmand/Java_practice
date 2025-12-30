package com.clientNeoSoft;

public class SortArray {

	public static void main(String[] args) {
		
		int a[] = {5,2,4,6,8,1,13,7,98,10};
		
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
			int temp = a[i];
			a[i]=a[j]; 
			a[j]=temp;
		}
			}	
	}
		for(int k:a) {
			System.out.print(k+" ");
		}
	}
}
