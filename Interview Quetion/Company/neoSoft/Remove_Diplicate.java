package com.neoSoft;

import java.util.LinkedHashSet;
import java.util.Set;

public class Remove_Diplicate {

	public static void main(String[] args) {
		
		 int[] a= {10,20,4,15,4,4,21,5,44,15};
		 
		Set<Integer> sc = new LinkedHashSet<>();

		for(int k:a) {
			sc.add(k);
		}
		System.out.println(sc);
	}

}
