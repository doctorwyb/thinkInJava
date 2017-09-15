package ch14;

import interfaces.A;

class B implements A{

	public void f() {}
	public void g() {}
}

public class InterfaceaViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		System.out.println(a.getClass().getName());
		if(a instanceof B){
			B b = (B)a;
			b.g();
		}
	}
}
