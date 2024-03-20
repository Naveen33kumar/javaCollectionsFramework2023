package hashMapConcepts;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashmapConcept {

	public static void main(String[] args) {
		
		// stores the value on the basis on the basis of<k,v>
		// 
		LinkedHashMap<String, String> hm1 = new LinkedHashMap<>();
		
		hm1.put("india", "delhi");
		hm1.put("pak", "karachi");
		hm1.put("ger", null);
		hm1.put("aus", "sydney");
		
		System.out.println(hm1);
		
		Iterator<String> it1 = hm1.keySet().iterator();
		while(it1.hasNext())
		{
			String key = it1.next();
			String value = hm1.get(key);
			
			System.out.println("key -> " + key + " " + "value -> " + value);
		}
		
	}
}
