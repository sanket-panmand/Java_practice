package com.neoSoft;

public class Count_less_more_number {

	public static void main(String[] args) {
		
		int[] a = { 10,20,5,6,78,11,25,66,78,25,1};
		int no =30;
		
		int maxCount =0;
		int minCount =0;
		
		for(int k: a) {
			if(k < no) {
				minCount++;
			}else {
				maxCount++;	
			}
		}
		System.out.println("minCount :"+minCount);
		System.out.println("maxCount : "+maxCount);

	}

}
