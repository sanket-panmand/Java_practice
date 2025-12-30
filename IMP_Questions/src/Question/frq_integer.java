package Question;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class frq_integer {

	public static void main(String[] args) {

		int [] a = {1,2,3,5,7,2,3};

		findDuplicate(a);
	}

	private static void findDuplicate(int[] a) {
		LinkedHashMap<Integer, Integer> hm = new LinkedHashMap<>();

		for (Integer k : a) {
			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);
			} else {
				hm.put(k, 1);
			}
		}
		for (Entry<Integer, Integer> e : hm.entrySet()) {

			if (e.getValue() > 0) { 
				System.out.println(e.getKey() + "   " + e.getValue());
			}
		}

	}
}
