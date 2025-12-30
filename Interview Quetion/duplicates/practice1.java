package duplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class practice1 {

	public static void main(String[] args) {
		
		String str ="java is programming language";
		
		char[] s = str.toCharArray();
		duplicate(s);
	}
	
	public static void duplicate(char[] s){
		
		LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
		
		for(Character k : s) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
			}
			else{
				hm.put(k, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> e : hm.entrySet()) {
			
			if(e.getValue() > 1) {
				System.out.println(e.getKey()+ "  "+ e.getValue());
			}
		}
	}
	
}
