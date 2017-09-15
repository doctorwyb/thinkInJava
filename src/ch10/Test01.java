package ch10;
//ÄÚ²¿Àà
public class Test01 {
class Contents{
	private int i=11;
	public int value(){return i;}
}
class Destination{
	private String lable;
	 Destination(String whereTo) {
		 lable=whereTo;
	}
	 String readLable(){return lable;}
}
	 public void ship(String dest){
		 Contents c=new Contents();
		 Destination d=new Destination(dest);
		 System.out.println(d.readLable());
	 }
	 public static void main(String[] args) {
		Test01 p=new Test01();
		p.ship("tradis");
	}
}

