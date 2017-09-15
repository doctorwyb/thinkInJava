package ch17;

import java.util.*;
import static net.mindview.util.Print.*;

public class Utilities {
	static List<String> list = Arrays.asList("one Two three Four five six one".split(" "));
	public static void main(String[] args) {
		print(list);
		print(Collections.disjoint(list, Collections.singletonList("Four")));
		print(Collections.max(list));
		print(Collections.min(list));
		print(Collections.max(list,String.CASE_INSENSITIVE_ORDER));
		print(Collections.min(list,String.CASE_INSENSITIVE_ORDER));
	}
}
