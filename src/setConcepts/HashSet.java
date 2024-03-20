package setConcepts;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

public class HashSet {

	public static void main(String[] args) {
		
		// Hashset will not store duplicate values
		
		Set<String> set = new java.util.HashSet<>();
		
		set.add("Naveen");
		set.add("ronaldo");
		set.add("messi");
		set.add("football");
		set.add("messi");
		set.add(null);
		
		System.out.println(set);
		
		System.out.println(set.contains("Naveen"));
		
		for(String s : set)
		{
			System.out.println(s);
		}
		set.remove("Naveen");
		
		System.out.println(set);
		
		Iterator<String> it =  set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set<Integer> first = new java.util.HashSet<>();
		first.addAll(Arrays.asList(new Integer[] {1,2,3,4,5,5,12,13,14,15,15}));
		
		Set<Integer> second = new java.util.HashSet<>();
		second.addAll(Arrays.asList(new Integer[] {1,2,3,4,5}));
		
		// get the union

		Set<Integer> union = new java.util.HashSet<>(first);
		union.addAll(second);
		System.out.println(union);
		
		System.out.println("***************");
		
		// get the intersection or common values
		
		Set<Integer> common = new java.util.HashSet<>(first);
		common.retainAll(second);
		System.out.println(common);
		
		System.out.println("***************");
		
		Set<Integer> unique = new java.util.HashSet<>(first);
		unique.removeAll(second);
		System.out.println(unique);
		
	}
}