package ch10;

public class Test03 {
void f(){
	System.out.println("DotThis.f()");
}
public  class Inner{
	public Test03 outer(){
		return Test03.this;
	}
}
public Inner inner(){return new Inner();}
public static void main(String[] args) {
	Test03 dt=new Test03();
	//Test03.Inner dti=dt.inner();
	Inner dti=dt.new Inner();
	dti.outer().f();
}
}
