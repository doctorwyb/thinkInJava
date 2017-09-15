package ch17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import net.mindview.util.Countries;

public class Lists {
	private static boolean b;
	private static String s;
	private static int i;
	private static Iterator<String> it;
	private static ListIterator<String> lit;
	public static void basicTest(List<String> a){
		a.add(1,"X");
		a.add("X");
		a.addAll(Countries.names());
		b = a.contains("1");
		b = a.containsAll(Countries.names(25));
		
		s = a.get(1);
		i = a.indexOf("X");
		b = a.isEmpty();
		
		it = a.iterator();
		lit = a.listIterator();
		lit = a.listIterator(3);
		
		i = a.lastIndexOf("1");
		a.remove(1);
		a.remove("3");
		a.set(1, "y");
		a.retainAll(Countries.names(25));//�Ƴ�����25�������
		a.removeAll(Countries.names(25));
		i = a.size();
		a.clear();
	}
	public static void iterMotion(List<String> a){
		ListIterator<String> it = a.listIterator();
		b = it.hasNext();
		b = it.hasPrevious();
		s = it.next();
		i = it.nextIndex();
		s = it.previous();
		i = it.previousIndex();
	}
	public static void iterMainpulation(List<String> a){
		ListIterator<String> it = a.listIterator();
		it.add("47");
		it.next();
		it.remove();
		it.next();
		it.set("47");
		
	}
	public static void testVisual(List<String> a){
		System.out.println(a);
		List<String> b = Countries.names(25);
		System.out.println("b = " + b);
		a.addAll(b);
		a.addAll(b);
		System.out.println(a);
		
		ListIterator<String> x = a.listIterator(a.size()/2);
		x.add("one");
		System.out.println(a);
		System.out.println(x.next());
		x.remove();
		System.out.println(x.next());
		x.set("47");
		System.out.println(a);
		
		x = a.listIterator(a.size());
		while (x.hasPrevious()) {
			System.out.println(x.previous() + " ");
		}
		System.out.println();
		System.out.println("testVisual finished");
		
	} 
	public static void testLinkedList(){
		LinkedList<String> ll = new LinkedList<String>();
		ll.addAll(Countries.names(25));
		System.out.println(ll);
		ll.addFirst("one");
		ll.addFirst("two");
		System.out.println(ll);
		System.out.println(ll.getFirst());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeFirst());
		System.out.println(ll.removeLast());
		System.out.println(ll);
	}
	public static void main(String[] args) {
		//basicTest(new LinkedList<String>(Countries.names(25)));
		//basicTest(new ArrayList<String>(Countries.names(25)));
		//iterMotion(new LinkedList<String>(Countries.names(25)));
		//iterMotion(new ArrayList<String>(Countries.names(25)));
		iterMainpulation(new LinkedList<String>(Countries.names(25)));
		/*iterMainpulation(new ArrayList<String>(Countries.names(25)));
		testVisual(new LinkedList<String>(Countries.names(25)));
		testLinkedList();*/
	}
}
