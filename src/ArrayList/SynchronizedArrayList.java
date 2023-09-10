package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		List<String> nameList = Collections.synchronizedList(new ArrayList<String>());
		
		nameList.add("java");
		nameList.add("C#");
		nameList.add("python");
		
		synchronized (nameList) {
			
			Iterator<String> list = nameList.iterator();
			while(list.hasNext())
			{
				System.out.println(list.next());
			}
		}
		// 2. copyOnWritrArrayList --> it is a class
		
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		
		empList.add("Naveen");
		empList.add("Dave");
		empList.add("chros");
		
		Iterator<String> list = empList.iterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
		}
	}
}
