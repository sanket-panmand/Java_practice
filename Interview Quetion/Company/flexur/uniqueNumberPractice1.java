package com.flexur;

import java.util.LinkedHashMap;
import java.util.Map;

public class uniqueNumberPractice1{
	
	public static void unique(int[] a) {
		
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();
		
		for(Integer k : a) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
			}
			else {
				hm.put(k, 1);
			}
		}
		for(Map.Entry<Integer,Integer> e : hm.entrySet()) {
			if(e.getValue() == 1) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}

	public static void main(String[] args) {
	 
		int [] a= {1,2,11,4,5,6,8,9,8,6};
		unique(a);
	
	}
	}