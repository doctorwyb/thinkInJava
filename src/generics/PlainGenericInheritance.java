package generics;

class GenericSetter<T>{
	void set(T arg){
		System.out.println("GenericSetter.set(Base)");
	}
}
class DerivedGS extends GenericSetter<Base>{
	void set(Derved derved){
		System.out.println("DerivedGS.set(Derived)");
	}
}
public class PlainGenericInheritance {
	public static void main(String[] args) {
		Base base = new Base();
		Derved derved = new Derved();
		DerivedGS dgs = new DerivedGS();
		dgs.set(derved);
		dgs.set(base);
	}
}
