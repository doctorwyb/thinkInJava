package ch14;

import java.util.ArrayList;
import java.util.List;


class CountedInteger{
	private static long counter;
	private final long id = counter++;
	public String toString(){
		return Long.toString(id);
	} 
}
public class FilledList<T> {
	private Class<T> type;
	public FilledList(Class<T> type){
		this.type = type;
	}
	public List<T> create(int nElements){
		List<T> result = new ArrayList<T>();
		for (int i = 0; i < nElements; i++) {
			try {
				result.add(type.newInstance());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return result;
	}
	public static void main(String[] args) {
		FilledList<CountedInteger> fl = 
				new FilledList<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
}
