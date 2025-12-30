package com.flexur;

import java.util.LinkedHashMap;
import java.util.Map;
class uniqueNumberPrint{
	
	public static void main(String[] argu) {
		
		int[] a= {1,5,2,8,9,11,7,6,3,2,4};
		
		
		number(a);
	}
	
	public static void number(int[] a) {
		
		LinkedHashMap<Integer , Integer> hm = new LinkedHashMap<>();
		
		for(int k:a) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
				}
			else {
				hm.put(k, 1);
			}
		}
		for(Map.Entry<Integer, Integer> e : hm.entrySet()) {
			if(e.getValue()==1) {
				System.out.println(e.getKey()+","+e.getValue());
			}
		}
	}
}