package hashMapConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
	
		// < > <= >= == !=

		HashMap<String, String> hm = new HashMap<>();
		
		hm.put("india", null);
		hm.put("pak", null);
		hm.put("ger", null);
		hm.put("aus", "sydney");
		hm.put("aus", "sydney1");
		
		
		Iterator<Entry<String, String>> it =  hm.entrySet().iterator();
		while(it.hasNext()) {
			Entry<String, String> entry =  it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		System.out.println("*******************");
		
		Iterator<String> it1 =  hm.keySet().iterator();
		while(it1.hasNext())
		{
		 	String key = it1.next();
			String value =  hm.get(key);
			System.out.println(key +" " + value);
		}
	}
   }