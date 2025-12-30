package com.logic.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class remove_Duplicate {

	public static void main(String[] args) {
		
		int[] a = {10,20,10,45,0,1,2,3,1,2,10,1};
		
		//Remove duplicate
		
		Set<Integer> remove = new LinkedHashSet<>();
		
		for(int k : a) {
			
			remove.add(k);
		}
		System.out.println(remove);
		
		//Array Sort
		
		List<Integer> sc =new ArrayList<>();
		for(int x : remove) {
			sc.add(x);
			Collections.sort(sc);
		}
		
		System.out.println(sc);
	}

}
