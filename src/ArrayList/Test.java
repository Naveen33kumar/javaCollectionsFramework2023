package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		 ArrayList<String> ar4 = new ArrayList<String>(Arrays.asList("A","B","C","D","F"));
			
			ArrayList<String> ar5 = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
			
			ar4.removeAll(ar5);
			
			System.out.println(ar4);
		
		
	}
}