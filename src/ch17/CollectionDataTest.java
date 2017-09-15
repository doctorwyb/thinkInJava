package ch17;

import java.util.LinkedHashSet;
import java.util.Set;

import net.mindview.util.CollectionData;
import net.mindview.util.Generator;

class Government implements Generator<String>{
	String[] foundation = ("MyEclipse has detected that less" +
			" than 5% of the 3MB of PS Survivor" +
			" Space (Heap memory) space remains.").split(" ");
	private int index;
	public String next() {
		// TODO Auto-generated method stub
		return foundation[index++];
	}
	
}
public class CollectionDataTest {
	public static void main(String[] args) {
		Set<String> set = new LinkedHashSet<String>(
				new CollectionData<String>(new Government(), 15));
		System.out.println(set);
		set.addAll(CollectionData.list(new Government(), 15));
		System.out.println(set);
	}
}
