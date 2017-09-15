package ch15;

public class ArrayOfGeneric {
	static final int SIZE = 100;
	static Generic<Integer> [] gia;
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		//produces
		//gia = (Generic<Integer>[]) new Object[SIZE];
		//Runtime
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
		
	}
}
