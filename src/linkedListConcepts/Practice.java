package linkedListConcepts;

import java.util.ArrayList;
import java.util.LinkedList;

public class Practice {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<>();
		ar.add("naveen");
		ar.add("chris");
		ar.add("dave");
		ar.add("rona");
		
		ar.add(null);
		ar.add(null);
		
		ar.add(3, "ferw");
		ar.add(0, "naveen updated");
		System.out.println(ar.get(3));
		System.out.println(ar.get(0));

		LinkedList<String> ll = new LinkedList<>();
		
		ll.add("daew");
		ll.add("nooe");
		
		ll.add(2, "uwiiw");
		
		System.out.println(ll.get(2));
		
	}
}
