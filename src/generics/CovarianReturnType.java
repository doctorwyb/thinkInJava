package generics;

class Base{}
class Derved extends Base{}

interface OrdinaryGetter{
	Base get();
}
interface DerivedGetter extends OrdinaryGetter{
	Derved get();
}

public class CovarianReturnType {
	void test(DerivedGetter d){
		Derved d2 = d.get();
	}
}
