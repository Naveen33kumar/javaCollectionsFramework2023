package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class AarrayListConcept {

	public static void main(String[] args) {
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		ar.add("Naveen");
		ar.add("Automation");
		ar.add("Engineer");
		ar.add("Naveen");
		
		System.out.println(ar);
		System.out.println(ar.get(1));
		//System.out.println(ar.get(-1)); // negative indexing is not allowed in java
		System.out.println(ar.size());
		
		ar.add("10");
		ar.add(10.22);
		
		System.out.println(ar.size());
		
		System.out.println("*****************");
		// List with other collection
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10,20,30));
		System.out.println(numbers);
		
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("naveen", "java", "C#"));
		System.out.println(names);
		
		
	}
}
