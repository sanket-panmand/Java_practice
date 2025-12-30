package com.flexur;

public class PrimePracticeSecond {

	public static void main(String[] argu) {
		
		int a =6;
		
		int temp = 0;
		for(int i=2;i<a-1;i++) {
			
			if(a % i == 0) {
				temp = temp +1;
			}
		}
		if(temp == 0) {
			System.out.println("Prime");
		}
		else {
			System.out.println("non prime");
		}
	}
	
}
