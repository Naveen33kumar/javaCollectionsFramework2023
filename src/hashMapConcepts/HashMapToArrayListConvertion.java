package hashMapConcepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapToArrayListConvertion {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hm = new HashMap<>();
		
		hm.put("finalsite", 50);
		hm.put("google", 30);
		hm.put("facebook", 340);
		
		System.out.println(hm.size());
		
		Iterator it = hm.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry pairs =  (Map.Entry) it.next();
			System.out.println(pairs.getKey() + " = " + pairs.getValue());
		}
		
		System.out.println("*****************");
		
		// convert hashmap to arraylist
		List<String> list = new ArrayList<>(hm.keySet());
		for(String company: list)
		{
			System.out.println(company);
		}
		
		System.out.println("*****************");
		List<Integer> list1 = new ArrayList<>(hm.values());
		for(Integer count: list1)
		{
			System.out.println(count);
		}
	}
}