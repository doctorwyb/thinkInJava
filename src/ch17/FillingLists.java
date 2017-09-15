package ch17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class StringAddress{
	private String s;

	public StringAddress(String s) {
		super();
		this.s = s;
	}

	@Override
	public String toString() {
		return "StringAddress [s=" + s + "]";
	}
	
}
public class FillingLists {
	public static void main(String[] args) {
		List<StringAddress> list = new ArrayList<StringAddress>(
				Collections.nCopies(4, new StringAddress("Hello")));
		System.out.println(list);
		Collections.fill(list, new StringAddress("World"));
		System.out.println(list);
	}
}
