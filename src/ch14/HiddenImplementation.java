package ch14;

import java.lang.reflect.Method;

import ch14.interfacea.A;
import ch14.packageaccess.HiddenC;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		A a = HiddenC.markeA();
		a.f();
		System.out.println(a.getClass().getName());
		callHiddenMethod(a,"g");
		callHiddenMethod(a,"u");
		callHiddenMethod(a,"v");
		callHiddenMethod(a,"w");
	}

	 static void callHiddenMethod(Object a, String methodName) throws Exception {
		 Method g = a.getClass().getDeclaredMethod(methodName);
		 g.setAccessible(true);
		 g.invoke(a);
	}
}
