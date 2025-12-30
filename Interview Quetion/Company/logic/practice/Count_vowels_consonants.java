package com.logic.practice;

public class Count_vowels_consonants {

	public static void main(String[] args) {
		
		String a =" Chech Count of the Vowel and Consonants";
		
		int vowel =0;
		int consonants=0;
	
		a=a.toLowerCase();
		
		char[] b = a.toCharArray();
	
		for(char K :b) {
			if(K=='a' || K=='e' || K=='i' || K=='o' || K=='u') {
				vowel++;
			}
			else {
				consonants++;
			}
		}
		System.out.println(vowel);
		System.out.println(consonants);
	
	}

}
