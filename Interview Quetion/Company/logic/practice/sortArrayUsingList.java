package com.logic.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortArrayUsingList {


	public static void main(String[] args) {
		
	
	int a[]= {10,2,01,4,5,10,2};
	List<Integer> sc =new ArrayList<>();
	for(int x : a) {
		sc.add(x);
			}
	Collections.sort(sc);
	System.out.println(sc);
}
}