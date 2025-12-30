 package duplicates;
import java.util.LinkedHashMap;
import java.util.Map;


public class CharracterFrequency {

	public static void main(String[] args) {
		
		String s ="this is a string and this string will be not a change";
		
		char[] a =s.toCharArray();
		
		duplicate(a);

	}
	public static void duplicate(char[] a) {
		
		LinkedHashMap<Character,Integer> hm = new LinkedHashMap<>();
		
		for( Character k : a) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
			}else {
				hm.put(k, 1);
			}
		}
		
		for(Map.Entry <Character,Integer> e : hm.entrySet()){
			//if(e.getValue()>0) {   // frequency
			//if(e.getValue()>1) {      //duplicate charater
			if(e.getValue()==1)  {        //UNnique character
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}

}
