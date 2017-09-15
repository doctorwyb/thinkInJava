package ch10;


public class Test04 {
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
	
		 public static void main(String[] args) {
			Test04 p=new Test04();
			Test04.Contents c=p.new Contents();
			Test04.Destination d=p.new Destination("Borneo");
			
		}
}
