package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListComparison {

	public static void main(String[] args) {
		
	    //1. sort and then equals
		
		ArrayList<String> ar1 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> ar2 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		ArrayList<String> ar3 = new ArrayList<String>(Arrays.asList("B","A","C","D","F"));
		
		
		Collections.sort(ar1);

		Collections.sort(ar2);
		
		System.out.println(ar1.equals(ar2)); // false
		
		Collections.sort(ar3);
		System.out.println(ar1.equals(ar3));
		
		//2. compare two list - find out the additional elements
        ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
		
		ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		
		ar4.removeAll(ar5);
		
		System.out.println(ar4);
		
		//3. find out the common element
        ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("java","python","C#","JS","PHP"));
		
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("java","python","C#","JS","Chat"));
		
		lang1.retainAll(lang2);
		System.out.println(lang1);
		
	}
}