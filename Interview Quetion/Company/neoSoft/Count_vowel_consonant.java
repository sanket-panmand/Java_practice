package com.neoSoft;

public class Count_vowel_consonant {

	public static void main(String[] args) {
		
		String a ="qwertyuiopasdfghjklzxcvbnm";
		int vowel = 0;
		int consonant = 0;
		a = a.toLowerCase();
		
		char[] s = a.toCharArray();

		for(char k:s) {
			if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u') {
				vowel++;
			}
			else {
				consonant++;
			}
		}
		System.out.println("A To Z Total vowels"
				+ " : " + vowel);
		System.out.println("A To Z Total consonant : "+consonant);
		
	}

}
