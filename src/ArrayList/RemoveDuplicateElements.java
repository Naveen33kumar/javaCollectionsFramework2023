package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {

	public static void main(String[] args) {
		
		// 1. using linkedhasset
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,1,2,34,344,44,443,33,12,33));
		
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<Integer>(numbers);
		
		ArrayList<Integer> numberWithoutDuplicates = new ArrayList<Integer>(linkedHashSet);
		
		System.out.println(numberWithoutDuplicates);
		
		// 2. using streams
		ArrayList<Integer> marksList = new ArrayList<Integer>(Arrays.asList(1,1,2,34,344,44,443,33,12,33));
		List<Integer> uniqueList = marksList.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
		
	}
}
