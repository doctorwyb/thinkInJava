package ch16;

import java.util.Arrays;

public class ArrayOptions {
	public static void main(String[] args) {
		//Arrays of object
		BeryllimSphere [] a;
		BeryllimSphere[] b = new BeryllimSphere[5];
		System.out.println("b: " + Arrays.toString(b));
		BeryllimSphere[] c = new BeryllimSphere[4];
		for (int i = 0; i < c.length; i++) {
			if(c[i] == null){
				c[i] = new BeryllimSphere();
			}
		}
		BeryllimSphere[] d = {new BeryllimSphere(),new BeryllimSphere(),new BeryllimSphere()};
		a = new BeryllimSphere[]{new BeryllimSphere(),new BeryllimSphere()};
		System.out.println("a.length = " + a.length);
		System.out.println("b.length = " + b.length);
		System.out.println("c.length = " + c.length);
		System.out.println("d.length = " + d.length);
		a = d;
		System.out.println("a.length = " + a.length);
		
		//Arrays of primitives
		int[] e;
		int[] f = new int[5];
		System.out.println("f: " + Arrays.toString(f));
		int[] g = new int[4];
		for (int i = 0; i < g.length; i++) {
			g[i] = i*i;
		}
		int[] h = {11,47,93};
		System.out.println("f.length = " + f.length);
		System.out.println("g.length = " + g.length);
		System.out.println("h.length = " + h.length);
		e = h;
		System.out.println("e.length = " + e.length);
		e = new int[]{1,2};
		System.out.println("e.length = " + e.length);
		
	}
}
