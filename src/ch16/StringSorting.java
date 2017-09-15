package ch16;

import java.util.Arrays;
import java.util.Collections;

import net.mindview.util.Generated;
import net.mindview.util.RandomGenerator;
//String����
public class StringSorting {
	public static void main(String[] args) {
		String[] sa = Generated.array(new String[20], new RandomGenerator.String(5));
		System.out.println("before sorting:");
		System.out.println(Arrays.toString(sa));
		//Ĭ��Ϊ�ʵ����򷨣���д��ĸ��ǰ
		Arrays.sort(sa);
		System.out.println("after sorting:");
		System.out.println(Arrays.toString(sa));
		//�����ķ���
		Arrays.sort(sa,Collections.reverseOrder());
		System.out.println("Reverse sort");
		System.out.println(Arrays.toString(sa));
		//���Դ�Сд����
		Arrays.sort(sa,String.CASE_INSENSITIVE_ORDER);
		System.out.println("Case-insensitive sort: ");
		System.out.println(Arrays.toString(sa));
	}
}
