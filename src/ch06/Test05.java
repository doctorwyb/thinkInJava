package ch06;
//向下转型
public class Test05 {
public static void main(String[] args) {
	Useful[] x={
			new Useful(),
			new MoreUseful()
	};
	x[0].f();
	x[1].g();
	((MoreUseful) x[1]).u();
//	((MoreUseful) x[0]).u();
}
}
class Useful{
	public void f(){}
	public void g(){}
}
class MoreUseful extends Useful{
	public void f(){}
	public void g(){}
	public void u(){}
	public void v(){}
	public void w(){}
}
