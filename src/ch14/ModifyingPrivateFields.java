package ch14;

import java.lang.reflect.Field;

class WithPrivateFinalField{
	private int i = 1;
	private final String s = "I'm totally safe";
	private String s2 = "Am I safe?";
	@Override
	public String toString() {
		return "i=" + i + "," + s + "," + s2;
	}
	
}
public class ModifyingPrivateFields {
	public static void main(String[] args) throws Exception {
		WithPrivateFinalField pf = new WithPrivateFinalField();
		
		System.out.println(pf);
		Field f = pf.getClass().getDeclaredField("i"); 
		f.setAccessible(true);
		System.out.println("f.getInt(pf):" + f.getInt(pf));
		System.out.println("---------------");
		f.setInt(pf, 47);
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s");
		f.setAccessible(true);
		System.out.println("f.get(pf):" + f.get(pf));
		System.out.println("---------------");
		f.set(pf, "No,you are not");
		System.out.println(pf);
		f = pf.getClass().getDeclaredField("s2");
		f.setAccessible(true);
		System.out.println("f.get(pf):" + f.get(pf));
		System.out.println("---------------");
		f.set(pf, "No,you are not");
		System.out.println(pf);
	}
}
