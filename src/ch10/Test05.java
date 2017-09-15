package ch10;


public class Test05 {
	public static void main(String[] args) {
		Parcel4 p=new Parcel4();
		Contents s=p.contests();
		Destination d=p.destination("ttt");
	}
		 }
class Parcel4{
			private class PContents implements Contents{
				private int i=11;
				public int value(){return i;}
			}
			protected class PDestination implements Destination{
				private String lable;
				 private PDestination(String whereTo) {
					 lable=whereTo;
				}
				public String readLable(){return lable;}
			}
			public Destination destination(String s){
				return new PDestination(s);
			}
			public Contents contests(){
				return new PContents();
			}
				
}
