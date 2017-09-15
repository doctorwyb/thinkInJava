package ch14;

interface Interface{
	void doSomething();
	void somethingElse(String arg);
}

class RealObject implements Interface{

	public void doSomething() {
		System.out.println("doSomething");
	}

	public void somethingElse(String arg) {
		System.out.println("sometingElse " + arg);
	}
	
}

class SimpleProxy implements Interface{
	private Interface proxied;
	public SimpleProxy(Interface proxied){
		this.proxied = proxied;
	}
	public void doSomething() {
		System.out.println("SimpleProxy doSomething");
		proxied.doSomething();
	}

	public void somethingElse(String arg) {
		System.out.println("SimpleProxy something " + arg);
		proxied.somethingElse(arg);
	}
	
}
public class SimpleProxyDemo {
	public static void consumer(Interface iface){
		iface.doSomething();
		iface.somethingElse("bonobo");
	}
	public static void main(String[] args) {
		consumer(new RealObject());
		consumer(new SimpleProxy(new RealObject()));
	}
}
