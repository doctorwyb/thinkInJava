package ch16;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;
//String排序
public class StringSorting {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(sa));
		//默认为词典排序法，大写字母在前
		Arrays.sort(sa);
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(sa));
		//上例的返序
		Arrays.sort(sa,Collections.reverseOrder());
		System.out.println("Reverse sort");
		System.out.println(Arrays.toString(sa));
		//忽略大小写排序
		Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive sort: ");
		System.out.println(Arrays.toString(sa));
	}
}
