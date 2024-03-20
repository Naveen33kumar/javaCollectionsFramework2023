package linkedListConcepts;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMethods {

	public static void main(String[] args) {
		
		// LL is a default class in java
		// it can be used as list,stack,queue
		// it allows null entry
		// dynamic collection
		// insertion and deletion  can be easily  implemented
		// it can contain duplicate elements
		// it is not synchrozized (not thread safe)
		// Manipulation is easy 
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Naveen");
		names.add("ronaldo");
		names.add("cena");
		names.add("rock");
		names.add(3, "rock");
		
		System.out.println(names.get(2));
		//System.out.println(names.size());
		
		Iterator<String> it = names.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	}
}
