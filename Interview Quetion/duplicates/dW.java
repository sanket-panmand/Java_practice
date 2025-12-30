package duplicates;
import java.util.LinkedHashMap;
import java.util.Map;


public class dW {

	public static void main(String[] args) {
		
		String s ="this is a string and this string will be not a change";
		s=s.trim();
		String[] a =s.split(" ");
		
		duplicate(a);

	}
	public static void duplicate(String[] a) {
		
		LinkedHashMap<String,Integer> hm = new LinkedHashMap<>();
		
		for( String k : a) {
			if(hm.containsKey(k)) {
				hm.put(k, hm.get(k)+1);
			}else {
				hm.put(k, 1);
			}
		}
		
		for(Map.Entry <String,Integer> e : hm.entrySet()){
			if(e.getValue() > 0) {   // frequency
			//if(e.getValue()>1) {      //duplicate String
			//if(e.getValue()==1) {        //UNnique String
				System.out.println(e.getKey()+" "+e.getValue());
			}
		}
	}

}
