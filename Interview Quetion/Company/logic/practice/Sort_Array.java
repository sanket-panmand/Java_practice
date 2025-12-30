package com.logic.practice;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort_Array {

	public static void main(String[] args) {

		int a[]= {9,6,1,5,4,3,2,8,1};
		
		List<Integer> obj = new LinkedList<>();
		for(int k: a) {
			obj.add(k);
		}
		System.out.println("Original: " + obj);
		Collections.sort(obj);
		System.out.println("Sorted : "+obj);
	}

}
