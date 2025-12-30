package duplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class characters {
	public static void main(String[] args) {
		String s= "This is an example of char";
		char [] a = s.toCharArray();    //converts a string to a sequence of characters.
		duplicatecharacters(a);
	}
	public static void duplicatecharacters(char[] a) {
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		for (char k : a) {
			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);
			} else {
				hm.put(k, 1);
			}
		}
		for (Map.Entry<Character, Integer> e : hm.entrySet()) {
			 if (e.getValue()>0) {  //will give frequncy of each   ...Count of each letter
			 //if (e.getValue()==1) { //Skip repeat letter
			//if (e.getValue() > 1) {    //only repeat letter & this count
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}

}