package ch16;

import java.util.Arrays;

public class MultidimensionalObjectArrays {
	public static void main(String[] args) {
		BeryllimSphere[][] spheres = {
				{new BeryllimSphere(),new BeryllimSphere()},	
				{new BeryllimSphere(),new BeryllimSphere(),
				 new BeryllimSphere(),new BeryllimSphere()},
				{new BeryllimSphere(),new BeryllimSphere(),
				 new BeryllimSphere(),new BeryllimSphere(),
				 new BeryllimSphere(),new BeryllimSphere()}	
		};
		System.out.println(Arrays.deepToString(spheres));
	}
}
