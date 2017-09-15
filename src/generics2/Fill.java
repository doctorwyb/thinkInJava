package generics2;

import java.util.Collection;

public class Fill {
	public static<T> void fill(Collection<T> collection,Class<? extends T> classToken, int size){
		for (int i = 0; i < size; i++) {
			try {
				collection.add(classToken.newInstance());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}
}

class Contract{
	private static long counter = 0;
	private final long id = counter++;
	public String toString(){
		return getClass().getName() + " " + id;
	}
}
class TitleTransfer  extends Contract{}



