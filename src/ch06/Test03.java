package ch06;

public class Test03 {
private String valve1,valve2,valve3,valve4;
private WaterSource source=new WaterSource();
private int i;
private float f;
public String toString(){
	 return 
		"valve1="+valve1+" "+	 
		"valve1="+valve2+" "+	 
		"valve1="+valve3+" "+	 
		"valve1="+valve4+"\n"+	 
		"i="+i+" "+"f="+f+" "+
		"source="+source;
}
public static void main(String[] args) {
	Test03 t03=new Test03();
	System.out.println(t03);
}
}
class WaterSource{
	private String s;
	 WaterSource() {
		 System.out.println("WaterSource()");
		 s="Constructed";
	 }
	 public String toString(){
		 return s;
	 }
}

