package com.logic.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class DuplicateNoPractice {

	public static void main(String[] args) {
		
		String s = "my name is sanket and surname is panmand";
//		s = s.trim();
//		String[] b =s.split(" ");
		
		char [] a = s.toCharArray();
		duplicateNo(a);

	}
	public static void duplicateNo(char[] a) {
		
		LinkedHashMap<Character ,Integer> hm = new LinkedHashMap<>();
		
		for(Character k : a) {
			if(hm.containsKey(k)){
				hm.put(k, hm.get(k)+1);
			}
			else {
				hm.put(k, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
			if(e.getValue()>1) {
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}

}
