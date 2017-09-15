package ch16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfGenerics {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String>[] ls;
		List[] la = new List[10];
		ls = (List<String>[])la;
		ls[0] = new ArrayList<String>();
		System.out.println(Arrays.toString(ls));
		Object[] objects = ls;
		objects[1] = new ArrayList<Integer>();
		
		List<BeryllimSphere>[] spheres = (List<BeryllimSphere>[])new List[10]; 
		for (int i = 0; i < spheres.length; i++) {
			spheres[i] = new ArrayList<BeryllimSphere>();
		}
		System.out.println(Arrays.toString(ls));
	}
}
