package setConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		
		Set<String> s1 = new HashSet<>();
		
		s1.add("Naveen");
		s1.add("ronaldo");
		s1.add("Naveen");
		s1.add("chris");
		
		System.out.println(s1);
		
		Hashtable<String, String> ht = new Hashtable<>();
		
		ht.put("naveen", "chris");
		ht.put("ronaldo", "dave");
		try {
		
			ht.put(null, null);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		ht.put("string", "chrsass");
		
		System.out.println(ht);
	}
}
