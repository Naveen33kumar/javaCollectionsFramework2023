package hashMapConcepts;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapBasics {

	public static void main(String[] args) {
		
		//no order - no indexing
		//stores values -- key-values<k,v>
		//duplicate cannot be stores in hashmap
		//can store n of null values but only one null key
		//hashmap is not thread safe
		//hastable is thread safe
		
		HashMap<String, String> cap = new HashMap<String, String>();
		cap.put("India", "delhi");
		cap.put("us", "washington DC");
		cap.put("uk", "london");
		cap.put("uk", "london1");
		cap.put(null, "berlin");
		cap.put(null, "abc");
		
		System.out.println(cap.get("uk"));
		System.out.println(cap.get(null));
		
		//iterator using key set
		Iterator<String> it = cap.keySet().iterator();
		
		while(it.hasNext())
		{
			String key = it.next();
			String value = cap.get(key);
			System.out.println("key = " + key + " value = " + value);
		}		
		
		System.out.println("****************");
		
		//iterator using entry set
		Iterator<Entry<String, String>> it1 = cap.entrySet().iterator();
		while(it1.hasNext())
		{
			Entry<String, String> entry = it1.next();
			System.out.println("key = " + entry.getKey() + "value =" + entry.getValue());
		}
		
		System.out.println("******************");
		
		// using lamda
		cap.forEach((k,v) -> System.out.println("key = " + k + "value = " + v));
	}
}