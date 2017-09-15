package ch14.packageaccess;

import ch14.interfacea.A;

class C implements A{
	public void f() {
		System.out.println("public c.f()");
	}
	public void g() {
		System.out.println("public c.g()");
	}
	void u(){
		System.out.println("package C.u()");
	}
	protected void v() {
		System.out.println("protected C,v()");
	}
	private void w() {
		System.out.println("private  C.w()");
	}
}

public class HiddenC {
	public static A markeA(){
		return new C();
	}
}
