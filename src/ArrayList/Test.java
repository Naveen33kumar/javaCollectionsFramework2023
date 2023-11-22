package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;

public class Test {

	public static void main(String[] args) {

		String name[] = {"java","c#","java"};
		
		for(int i=0; i<name.length; i++)
		{
			for(int j=i+1; j<name.length; j++)
			{
				if(name[i].equals(name[j]))
				{
					System.out.println(name[i]);
				}
			}
		}
	}
}