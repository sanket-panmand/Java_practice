package Question;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FreqString {

	public static void main(String[] args) {

		String s = "Hello Word Hello Java";
		//s = s.trim(); // white space

		String[] a = s.split(" ");
		findDuplicate(a);
	}

	private static void findDuplicate(String[] a) {
		LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();

		for (String k : a) {

			if (hm.containsKey(k)) {
				hm.put(k, hm.get(k) + 1);
			} else {
				hm.put(k, 1);
			}

		}
		for (Entry<String, Integer> e : hm.entrySet()) {

			if (e.getValue() > 0) {
				System.out.println(e.getKey() + "   " + e.getValue());
			}
		}

	}

}
