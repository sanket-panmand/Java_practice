package duplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class numbers {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 2, 4, 2, 6, 4, 2, 1, 7 };
		duplicatenumber(a);

	}

	public static void duplicatenumber(int[] a) {
  
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

		for (Integer k : a) {
			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);

			} else {
				hm.put(k, 1);
			}
		}
		for (Map.Entry<Integer, Integer> e : hm.entrySet()) {
			// if (e.getValue()>0) { will give frequncy of each
			// if (e.getValue()==1) {
			if (e.getValue() > 1) { // print duplicate no
				System.out.println(e.getKey() + " " + e.getValue());
			}
		}
	}
}
