package duplicates;

import java.util.LinkedHashMap;
import java.util.Map;
 

public class words {
	public static void main(String[] args) {

		String s= " hello hello Bhaii";
		//String[] a = s.toCharArray();
		s=s.trim();    //remove white spaces 
		String [] a= s.split(" "); //string into an array of words
		duplicatewords(a);

	}

	public static void duplicatewords(String[] a) {

		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

		for (String k : a) {
			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);

			} else {
				hm.put(k, 1);
			}
		}
		for (Map.Entry<String, Integer> e : hm.entrySet()) {
			 if (e.getValue()>0) {  //will give frequncy of each
			 //if (e.getValue()==1) { only unique value 
			//if (e.getValue() > 1) { // only duplicate value
				System.out.println(e.getKey() + " " + e.getValue());
			}
			

		}
	}

}