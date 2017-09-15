package ch17;

import java.util.*;

import net.mindview.util.Countries;

public class ReadOnly {
	static Collection<String> data = new ArrayList<String>(Countries.names(6));
	public static void main(String[] args) {
		Collection<String> c = Collections.unmodifiableCollection(new ArrayList<String>(data));
		System.out.println(c);
		//c.add("one");
		data.add("asdasda");
		List<String> a = Collections.unmodifiableList(new ArrayList<String>(data));
		System.out.println(a);
		ListIterator<String> lit = a.listIterator();
		//Iterator<String> it = a.iterator();
		System.out.println(lit.next());
	}
}
