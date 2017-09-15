package ch17;

import java.util.*;

public class ListSortSearch {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>(Utilities.list);  
		list.addAll(Utilities.list);
		System.out.println(list);
		Collections.shuffle(list, new Random(47));
		System.out.println("Shuffled :" + list);
		ListIterator<String> it = list.listIterator(10);
		while (it.hasNext()) {
			it.next();
			it.remove();
		}
		System.out.println("Trimmed: " + list);
		Collections.sort(list);
		System.out.println("Sort: " + list);
		String key = list.get(2);
		int index = Collections.binarySearch(list, key);
		System.out.println("Location of " + key + " is " + index + 
				", list.get(" + index + ") = " + list.get(index));
	}
	
}
