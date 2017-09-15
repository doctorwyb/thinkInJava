package ch10;
//¾²Ì¬ÄÚ²¿Àà
public class Parcel11 {
private static class ParcelContents implements Contents{
	private int i=11;
	public int value() {return i;}
}
protected static class ParcelDestination implements Destination{
    private String lable;
    private ParcelDestination(String whereTo){
    	lable=whereTo;
    }
	public String readLable() {return lable;}
    public static void f(){}
    static int x=10;
    static class AnotherLevel{
    	public static void f(){}
    	static int x=10;
    }
}
public static Destination destination(String s){
	return new ParcelDestination(s);
}
public static Contents contents(){
	return new ParcelContents();
}
public static void main(String[] args) {
	Contents c=contents();
	Destination d=destination("doctor");
}
}
