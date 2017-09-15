package ch17;

import java.util.LinkedHashMap;

import com.sun.org.apache.bcel.internal.generic.LNEG;

import net.mindview.util.CountingMapData;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		LinkedHashMap<Integer, String> linkedMap = new LinkedHashMap<Integer, String>(new CountingMapData(9));
		System.out.println(linkedMap);
		//least-recently-used oeder
		linkedMap = new LinkedHashMap<Integer, String>(16,0.75f,true);
		linkedMap.putAll(new CountingMapData(9));
		System.out.println(linkedMap);
		for (int i = 0; i < 6; i++) {
			linkedMap.get(i);
		}
		System.out.println(linkedMap);
		linkedMap.get(0);
		System.out.println(linkedMap);
	}
}
