package generics;

public class Holder<T> {
	private T value;
	public Holder(){}
	public Holder(T value) {
		super();
		this.value = value;
	}
	public T get() {
		return value;
	}
	public void set(T value) {
		this.value = value;
	}
	public boolean equals(Object obj){
		return value.equals(obj);
	}
	public static void main(String[] args) {
		Holder<Apple> Apple = new Holder<Apple>(new Apple());
		Apple d = Apple.get();
		Holder<? extends Fruit> fruit =Apple;
		Fruit p = fruit.get();
		d = (generics.Apple) fruit.get();
		try{
			Orange c = (Orange)fruit.get(); 
		}catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(fruit.equals(d));
	}
}
