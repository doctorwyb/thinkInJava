package generics;

public class BasicHolder<T> {
	T element;

	T get() {
		return element;
	}

	void set(T arg) {
		element = arg;
	}
	
	void f(){
		System.out.println(element.getClass().getSimpleName());
	}
}
