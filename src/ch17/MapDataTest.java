package ch17;

import java.util.Iterator;


import net.mindview.util.CountingGenerator;
import net.mindview.util.Generator;
import net.mindview.util.MapData;
import net.mindview.util.Pair;
import net.mindview.util.RandomGenerator;

class Letters implements Generator<Pair<Integer, String>>,Iterable<Integer> {
		private int size = 9;
		private int number = 1;
		private char letter = 'A';

	public Iterator<Integer> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Integer>() {
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return number < size;
			}
			public Integer next() {
				// TODO Auto-generated method stub
				return number++;
			}
			public void remove() {
				// TODO Auto-generated method stub
			}
		};
	}

	public Pair<Integer, String> next() {
		// TODO Auto-generated method stub
		return new Pair<Integer, String>(number++, "" + letter++);
	}
	
}

public class MapDataTest {
	public static void main(String[] args) {
		System.out.println(MapData.map(new Letters(), 11));
		
		System.out.println(MapData.map(new CountingGenerator.Character(),
				new RandomGenerator.String(3), 8));
		
		System.out.println(MapData.map(new CountingGenerator.Character(),
				"Value", 6));
		
		System.out.println(MapData.map(new Letters(), new RandomGenerator.String()));
		
		System.out.println(MapData.map(new Letters(), "Pop"));
	}
	
	
	
}
