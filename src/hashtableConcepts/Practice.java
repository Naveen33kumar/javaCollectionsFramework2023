package hashtableConcepts;

import java.util.ArrayList;

public class Practice {

	ArrayList<String> ar = new ArrayList<>();
	
	public void set()
	{
		ar.add("naveen");
		System.out.println(ar.get(0));
		System.out.println("set method");
	}
	
	public static void main(String[] args) {
	
		Practice p1 = new Practice();
		p1.set();
		
	}
}
