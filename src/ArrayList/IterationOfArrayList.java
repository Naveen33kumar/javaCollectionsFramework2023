package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class IterationOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		
		ar.add("Dave");
		ar.add("Alen");
		ar.add("rono");
		
		// 1. for loop
		for(int i=0; i<ar.size(); i++)
		{
			System.out.println(ar.get(i));
		}
        
		System.out.println("*****************");		
		
        // 2. for each loop
		for(String s: ar)
		{
			System.out.println(s);
		}
		
		System.out.println("*****************");		
		
		//3. java streams with lamda
		ar.stream().forEach(ele -> System.out.println(ele));
		
		System.out.println("*****************");		
		
		//4. iterator
		Iterator<String> i = ar.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}		
	}
}