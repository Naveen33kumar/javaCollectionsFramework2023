package hashtableConcepts;

import java.util.Hashtable;

public class HashTable {

	public static void main(String[] args) {
		
		// hashtable is thread safe
		// hashtable will not store null values it will give exception
		// stores the value in the form key value format
		// it not will maintain insertion order
		
		Hashtable<String, Integer> ht = new Hashtable<>();
		
		ht.put("chris", 222);
		ht.put("ronaldo",123);
		ht.put("naveen", 827);
		//ht.put(null, 222);
		
		
		
		System.out.println(ht);
		
		
		
	}
}
