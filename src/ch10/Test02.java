package ch10;


public class Test02 {
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
	//change
	public Destination to(String s){
		return new Destination(s);
	}
	public Contents contests(){
		return new Contents();
	}
	//end
		 public void ship(String dest){
			 Contents c=new Contents();
			 Destination d=new Destination(dest);
			 System.out.println(d.readLable());
		 }
		 public static void main(String[] args) {
			Test02 p=new Test02();
			p.ship("tradis");
			Test02 q=new Test02();
			Test02.Contents c=q.contests();
			Test02.Destination d=q.to("Borneo");
			
		}
}
