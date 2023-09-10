package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> ar1 = new ArrayList<String>();
		
		ar1.add("java");
		ar1.add("c#");
		ar1.add("python");
		
		ArrayList<String> ar2 = new ArrayList<String>();
		ar2.add("selenium");
		ar2.add("webdriver");
		ar2.add("cypress");
		
		System.out.println(ar1);
		System.out.println(ar2);
		
		ar1.addAll(ar2);
		
		System.out.println(ar1);
		
		ar1.removeAll(ar2);
		
		System.out.println(ar1);
		
		//ar1.addAll(ar2);
		
		//System.out.println(ar1);
		
		//ar1.addAll(2, ar2);
		
		//System.out.println(ar1);
		
		//ar1.clear();
		
		//System.out.println(ar1);
		
		ArrayList<String> clonelist = (ArrayList<String>)ar1.clone();
		System.out.println(clonelist);
		
		System.out.println(ar1.contains("c#1"));
		
		ArrayList<String> newName = new ArrayList<String>(Arrays.asList("one","two","three"));
		
		int i = newName.lastIndexOf("three");
		
		System.out.println(i);
		
		newName.remove(1);
		
		System.out.println(newName);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8));
		numbers.removeIf(num -> num%2 ==0);
		System.out.println(numbers);
		
		ArrayList<String> name1 = new ArrayList<String>(Arrays.asList("dhoni","ronaldo","dhoni", "messi"));
		name1.retainAll(Collections.singleton("dhoni"));
		System.out.println(name1);
	}
}
