package ch03;

public class Test6 {
public static void main(String[] args) {
	Other.main(new String[]{"aaa","bbb","ccc"});
}
}
class Other{
	public static void main(String[] args) {
		for(String s:args)
			System.out.println(s+" ");
	}
	
}
